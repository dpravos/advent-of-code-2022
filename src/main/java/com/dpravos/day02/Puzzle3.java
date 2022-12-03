package com.dpravos.day02;

import com.dpravos.shared.InputGetter;
import com.dpravos.shared.Puzzle;

public final class Puzzle3 extends Puzzle {

    public Puzzle3(InputGetter inputGetter) {
        super(inputGetter);
    }

    public String solve() {
        var input = inputGetter.day(2);

        var rounds = input.lines().stream()
                .map(line -> line.split(" "))
                .map(plays -> new Round(plays[0], plays[1]))
                .toList();

        var totalScore = rounds.stream()
                .map(Round::score)
                .reduce(Integer::sum)
                .orElseThrow();

        return String.valueOf(totalScore);
    }
}
