package com.dpravos.day07;

import java.util.List;

public class ListContent extends Command {

    public ListContent(List<String> output) {
        super(output);
    }

    @Override
    public void execute(Terminal terminal) {
        if (output == null) {
            return;
        }

        List<Node> nodes = output.stream().map(this::toNode).toList();

        nodes.forEach(terminal.currentDirectory()::add);
    }

    private Node toNode(String line) {
        var words = line.split(" ");
        if (words[0].equals("dir")) {
            return new Directory(words[1]);
        }

        return new File(words[1], Integer.parseInt(words[0]));
    }
}