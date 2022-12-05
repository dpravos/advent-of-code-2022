package com.dpravos.day05;

public final class Crane {
    private final Stack[] stacks;

    public Crane(Stack... stacks) {
        this.stacks = stacks;
    }

    public void move(int quantity, int origin, int destination) {
        for (int i = 0; i < quantity; i++) {
            var crate = stacks[origin - 1].extract();
            stacks[destination - 1].add(crate);
        }
    }
}
