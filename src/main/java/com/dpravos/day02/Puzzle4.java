package com.dpravos.day02;

import com.dpravos.shared.Puzzle;
import com.dpravos.shared.InputGetter;

import java.util.Arrays;
import java.util.List;

public class Puzzle4 extends Puzzle {

    public Puzzle4(InputGetter inputGetter) {
        super(inputGetter);
    }

    public String solve() {
        var input = inputGetter.day(2);
        List<String> lines = Arrays.stream(input.split("\n")).toList();

        List<RoundV2> rounds = lines.stream()
                .map(line -> line.split(" "))
                .map(plays -> new RoundV2(plays[0], plays[1]))
                .toList();

        Integer totalScore = rounds.stream()
                .map(RoundV2::score)
                .reduce(Integer::sum)
                .orElseThrow();

        return String.valueOf(totalScore);
    }
}
