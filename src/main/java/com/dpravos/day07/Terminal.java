package com.dpravos.day07;

import com.dpravos.day07.command.Command;
import com.dpravos.day07.command.CommandParser;
import com.dpravos.day07.node.Directory;
import com.dpravos.shared.Input;

import java.util.List;
import java.util.Set;

import static com.dpravos.day07.node.Directory.PARENT_DIR;
import static com.dpravos.day07.node.Directory.ROOT_DIR;

public class Terminal {

    private final CommandParser commandParser;

    private final Directory root;

    private Directory currentDirectory;

    public Terminal(CommandParser commandParser) {
        this.commandParser = commandParser;
        root = Directory.root();
        currentDirectory = root;
    }

    Set<Directory> allDirectories() {
        return root.directories();
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

        if (name.equals(PARENT_DIR)) {
            return currentDirectory.parent();
        }

        return currentDirectory.getDirectory(name);
    }

    public Directory currentDirectory() {
        return currentDirectory;
    }
}
