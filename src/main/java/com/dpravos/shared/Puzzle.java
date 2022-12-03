package com.dpravos.shared;

public abstract class Puzzle {
    protected final InputGetter inputGetter;

    public Puzzle(InputGetter inputGetter) {
        this.inputGetter = inputGetter;
    }

    public abstract String solve();
}
