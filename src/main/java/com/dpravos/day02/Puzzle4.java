package com.dpravos.day02;

import com.dpravos.shared.InputGetter;
import com.dpravos.shared.Puzzle;

public class Puzzle4 extends Puzzle {

    public Puzzle4(InputGetter inputGetter) {
        super(inputGetter);
    }

    public String solve() {
        var input = inputGetter.day(2);

        var rounds = input.lines().stream()
                .map(line -> line.split(" "))
                .map(plays -> new RoundV2(plays[0], plays[1]))
                .toList();

        var totalScore = rounds.stream()
                .map(RoundV2::score)
                .reduce(Integer::sum)
                .orElseThrow();

        return String.valueOf(totalScore);
    }
}
