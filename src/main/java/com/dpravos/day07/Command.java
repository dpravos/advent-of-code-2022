package com.dpravos.day07;

import java.util.List;

public abstract class Command {

    protected final List<String> output;

    public Command() {
        this.output = null;
    }

    public Command(List<String> output) {
        this.output = output;
    }

    public abstract void execute(Terminal terminal);
}
