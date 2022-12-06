package com.dpravos.day05;

public final class Crane2 {
    private final Stack[] stacks;

    public Crane2(Stack... stacks) {
        this.stacks = stacks;
    }

    public void move(Instruction instruction) {
        var crates = stacks[instruction.origin() - 1].extract(instruction.quantity());
        stacks[instruction.destination() - 1].addAll(crates);
    }
}
