package com.dpravos.day05;

public final class Crane {
    private final Stack[] stacks;

    public Crane(Stack... stacks) {
        this.stacks = stacks;
    }

    public void move(Instruction instruction) {
        for (int i = 0; i < instruction.quantity(); i++) {
            var crate = stacks[instruction.origin() - 1].extract();
            stacks[instruction.destination() - 1].add(crate);
        }
    }
}
