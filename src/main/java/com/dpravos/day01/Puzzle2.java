package com.dpravos.day01;

import com.dpravos.shared.InputGetter;

import java.util.List;

public class Puzzle2 {

    private final InputGetter inputGetter;

    public Puzzle2(InputGetter inputGetter) {
        this.inputGetter = inputGetter;
    }

    public String solve() {

        String input = inputGetter.day(1);

        List<Elf> elves = Elf.fromInput(input);

        Integer top3calories = elves.stream().sorted((a, b) -> b.calories() - a.calories())
                .limit(3)
                .map(Elf::calories)
                .reduce(Integer::sum)
                .orElseThrow();

        return String.valueOf(top3calories);
    }
}
