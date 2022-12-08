package com.dpravos.day07;

import static com.dpravos.day07.Directory.ROOT_DIR;

public class Terminal {

    private final Directory root;

    private Directory currentDirectory;

    public Terminal() {
        root = Directory.root();
        currentDirectory = root;
    }

    public void parse(String commandLine) {
        parse(commandLine, null);
    }

    public void parse(String commandLine, String output) {
        if (commandLine.equals("$ cd /")) {
            var command = new ChangeDirectory(ROOT_DIR);
            command.execute(this);
        }
    }

    private void execute(Command command) {
        command.execute(this);
    }

    public String pwd() {
        return currentDirectory.name();
    }

    public void setCurrentDirectory(String target) {
        if (target.equals(ROOT_DIR)) {
            this.currentDirectory = root;
        }
    }
}
