package com.dpravos.day01;

import com.dpravos.shared.InputGetter;
import com.dpravos.shared.Puzzle;

import java.util.Comparator;
import java.util.List;

public class Puzzle1 extends Puzzle {

    public Puzzle1(InputGetter inputGetter) {
        super(inputGetter);
    }

    @Override
    public String solve() {

        String input = inputGetter.day(1);

        List<Elf> elves = Elf.fromInput(input);

        int maxCalories = elves.stream().max(Comparator.comparingInt(Elf::calories))
                .orElseThrow()
                .calories();

        return String.valueOf(maxCalories);
    }
}
