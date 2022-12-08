package com.dpravos.day07.command;

import com.dpravos.day07.Terminal;

public final class ChangeDirectory extends Command {
    private final String target;

    public ChangeDirectory(String target) {
        this.target = target;
    }


    @Override
    public void execute(Terminal terminal) {
        terminal.setCurrentDirectory(target);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChangeDirectory that = (ChangeDirectory) o;

        return target.equals(that.target);
    }

    @Override
    public int hashCode() {
        return target.hashCode();
    }

    @Override
    public String toString() {
        return "ChangeDirectory{" +
               "target='" + target + '\'' +
               '}';
    }
}