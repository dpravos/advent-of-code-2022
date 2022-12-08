package com.dpravos.day07;

import com.dpravos.shared.Input;

import java.util.*;

public class CommandParser {
    public List<Command> parse(Input input) {

        Map<String, List<String>> commandOutputs = new HashMap<>();
        String currentCommand = null;

        for (String line : input.lines()) {
            if (line.startsWith("$")) {
                currentCommand = line;
                commandOutputs.put(currentCommand, new ArrayList<>());
            } else {
                if (currentCommand != null) {
                    commandOutputs.get(currentCommand).add(line);
                }
            }
        }

        return commandOutputs.keySet().stream()
                .map(commandLine -> create(commandLine, commandOutputs.get(commandLine)))
                .toList();
    }

    private Command create(String commandLine, List<String> outputs) {
        var words = commandLine.split(" ");
        var name = words[1];
        var args = Arrays.copyOfRange(words, 2, words.length);

        return switch (name) {
            case "cd" -> new ChangeDirectory(args[0]);
            case "ls" -> new ListContent(outputs);
            default -> throw new RuntimeException("Wrong command");
        };
    }
}
