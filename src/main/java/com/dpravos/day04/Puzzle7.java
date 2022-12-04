package com.dpravos.day04;

import com.dpravos.shared.InputGetter;
import com.dpravos.shared.Puzzle;

final public class Puzzle7 extends Puzzle {

    public Puzzle7(InputGetter inputGetter) {
        super(inputGetter);
    }

    @Override
    public String solve() {
        var lines = inputGetter.day(4).lines();

        var count = lines.stream()
                .map(AssignmentPair::fromLine)
                .filter(AssignmentPair::fullOverlap)
                .count();

        return String.valueOf(count);
    }
}
