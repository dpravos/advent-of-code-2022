package com.dpravos.day02;

import com.dpravos.shared.InputGetter;

import java.util.Arrays;
import java.util.List;

public class Puzzle4 {

    private final InputGetter inputGetter;

    public Puzzle4(InputGetter inputGetter) {
        this.inputGetter = inputGetter;
    }

    public String solve() {
        var input = inputGetter.day(2);
        List<String> lines = Arrays.stream(input.split("\n")).toList();

        return "12";
    }
}
