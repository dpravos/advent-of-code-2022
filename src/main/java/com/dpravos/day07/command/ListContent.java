package com.dpravos.day07.command;

import com.dpravos.day07.node.Directory;
import com.dpravos.day07.node.File;
import com.dpravos.day07.node.Node;
import com.dpravos.day07.Terminal;

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

    @Override
    public String toString() {
        return "ListContent{" +
               "output=" + output +
               '}';
    }
}
