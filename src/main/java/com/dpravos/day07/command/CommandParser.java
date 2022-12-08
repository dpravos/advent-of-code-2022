package com.dpravos.day07.command;

import com.dpravos.shared.Input;

import java.util.*;

public class CommandParser {
    public List<Command> parse(Input input) {

        List<Command> commands = new ArrayList<>();

        String currentCommand = null;
        List<String> currentOutputs = null;

        for (var line : input.lines()) {
            if (line.startsWith("$")) {
                if (currentCommand != null ) {
                    commands.add(create(currentCommand, currentOutputs));
                }
                currentCommand = line;
                currentOutputs = new ArrayList<>();
            } else {
                if (currentOutputs != null) {
                    currentOutputs.add(line);
                }
            }
        }

        if (currentCommand != null ) {
            commands.add(create(currentCommand, currentOutputs));
        }

        return commands;
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
