package com.dpravos.day01;

import com.dpravos.shared.InputGetter;

public abstract class Puzzle {
    protected final InputGetter inputGetter;

    public Puzzle(InputGetter inputGetter) {
        this.inputGetter = inputGetter;
    }

    public abstract String solve();
}
