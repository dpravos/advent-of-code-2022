package com.dpravos.day07;

import com.dpravos.shared.Input;

import java.util.List;

import static com.dpravos.day07.Directory.ROOT_DIR;

public class Terminal {

    private final CommandParser commandParser;

    private final Directory root;

    private Directory currentDirectory;

    public Terminal(CommandParser commandParser) {
        this.commandParser = commandParser;
        root = Directory.root();
        currentDirectory = root;
    }

    public void parse(Input commandLine) {
        List<Command> commands = commandParser.parse(commandLine);
        commands.forEach(this::execute);
    }

    private void execute(Command command) {
        command.execute(this);
    }

    public String pwd() {
        return currentDirectory.name();
    }

    public void setCurrentDirectory(String target) {
        this.currentDirectory = directoryByName(target);

    }

    private Directory directoryByName(String name) {
        if (name.equals(ROOT_DIR)) {
            return root;
        }

        return currentDirectory.getDirectory(name);
    }

    public Directory root() {
        return root;
    }

    public Directory currentDirectory() {
        return currentDirectory;
    }
}
