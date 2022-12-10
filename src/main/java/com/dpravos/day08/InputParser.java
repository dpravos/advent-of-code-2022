package com.dpravos.day08;

import com.dpravos.shared.Input;

public class InputParser {
    public int[][] parse(Input input) {
        return input.lines().stream().map(this::toArrayDigits).toArray(int[][]::new);
    }

    private int[] toArrayDigits(String line) {
        return line.chars().map(Character::getNumericValue).toArray();
    }
}
