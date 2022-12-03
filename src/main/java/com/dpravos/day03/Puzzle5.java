package com.dpravos.day03;

import com.dpravos.day01.Puzzle;
import com.dpravos.shared.InputGetter;

import java.util.Arrays;
import java.util.List;

public class Puzzle5 extends Puzzle {

    public Puzzle5(InputGetter inputGetter) {
        super(inputGetter);
    }

    @Override
    public String solve() {
        var input = inputGetter.day(3);
        List<String> lines = Arrays.stream(input.split("\n")).toList();

        var rucksacks = lines.stream().map(Rucksack::new).toList();

        var totalPriority = rucksacks.stream()
                .map(Rucksack::priority)
                .reduce(Integer::sum)
                .orElseThrow();

        return String.valueOf(totalPriority);
    }
}
