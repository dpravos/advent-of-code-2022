package com.dpravos.day05;

import java.util.stream.IntStream;

public class CargoParser {
    public int amountOfStacks(String line) {
        return (line.length() + 1) / 4;
    }

    public Stack[] parseLine(String line) {
        var filled = line + " ";
        var stacks = IntStream.range(0, filled.length() / 4)
                .mapToObj(i -> new Stack())
                .toArray(Stack[]::new);

        for (int i = 0; i < stacks.length; i++) {
            var crateLetter = filled.substring(4 * i, 4 * i + 3).charAt(1);
            if (!Character.isWhitespace(crateLetter)) {
                stacks[i].add(new Crate(String.valueOf(crateLetter)));
            }
        }

        return stacks;
    }
}
