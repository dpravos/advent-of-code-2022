package com.dpravos.day01;

import com.dpravos.shared.InputGetter;
import com.dpravos.shared.Puzzle;

public final class Puzzle2 extends Puzzle {

    public Puzzle2(InputGetter inputGetter) {
        super(inputGetter);
    }

    public String solve() {

        var input = inputGetter.day(1);

        var elves = Elf.fromInput(input);

        var top3calories = elves.stream().sorted((a, b) -> b.calories() - a.calories())
                .limit(3)
                .map(Elf::calories)
                .reduce(Integer::sum)
                .orElseThrow();

        return String.valueOf(top3calories);
    }
}
