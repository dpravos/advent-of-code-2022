package com.dpravos.day03;

import com.dpravos.shared.InputGetter;
import com.dpravos.shared.Puzzle;

public final class Puzzle5 extends Puzzle {

    public Puzzle5(InputGetter inputGetter) {
        super(inputGetter);
    }

    @Override
    public String solve() {
        var input = inputGetter.day(3);

        var rucksacks = input.lines().stream().map(Rucksack::new).toList();

        var totalPriority = rucksacks.stream()
                .map(Rucksack::priority)
                .reduce(Integer::sum)
                .orElseThrow();

        return String.valueOf(totalPriority);
    }
}
