package com.dpravos.day01;

import com.dpravos.shared.InputGetter;
import com.dpravos.shared.Puzzle;

import java.util.Comparator;

public class Puzzle1 extends Puzzle {

    public Puzzle1(InputGetter inputGetter) {
        super(inputGetter);
    }

    @Override
    public String solve() {

        var input = inputGetter.day(1);

        var elves = Elf.fromInput(input);

        var maxCalories = elves.stream().max(Comparator.comparingInt(Elf::calories))
                .orElseThrow()
                .calories();

        return String.valueOf(maxCalories);
    }
}
