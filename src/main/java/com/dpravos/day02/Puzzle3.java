package com.dpravos.day02;

import com.dpravos.shared.InputGetter;

import java.util.Arrays;
import java.util.List;

public class Puzzle3 {

    private final InputGetter inputGetter;

    public Puzzle3(InputGetter inputGetter) {
        this.inputGetter = inputGetter;
    }

    public String solve() {
        var input = inputGetter.day(2);
        List<String> lines = Arrays.stream(input.split("\n")).toList();

        List<Round> rounds = lines.stream()
                .map(line -> line.split(" "))
                .map(plays -> new Round(plays[0], plays[1]))
                .toList();

        Integer totalScore = rounds.stream()
                .map(Round::score)
                .reduce(Integer::sum)
                .orElseThrow();

        return String.valueOf(totalScore);
    }
}
