package com.dpravos.day04;

import com.dpravos.shared.InputGetter;
import com.dpravos.shared.Puzzle;

public class Puzzle8 extends Puzzle {
    public Puzzle8(InputGetter inputGetter) {
        super(inputGetter);
    }

    @Override
    public String solve() {
        var lines = inputGetter.day(4).lines();

        var count = lines.stream()
                .map(AssignmentPair::fromLine)
                .filter(AssignmentPair::overlaps)
                .count();

        return String.valueOf(count);
    }
}
