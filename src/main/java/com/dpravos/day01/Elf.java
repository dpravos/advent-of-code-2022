package com.dpravos.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Elf {

    private final Stack stack;

    public Elf(Stack stack) {
        this.stack = stack;
    }

    public static List<Elf> fromInput(String input) {
        List<Stack> stacks = parseInput(input);
        return stacks.stream().map(Elf::new).toList();
    }

    public int calories() {
        return stack.calories();
    }

    private static List<Stack> parseInput(String input) {
        List<String> lines = Arrays.stream(input.split("\n")).toList();

        List<Stack> stacks = new ArrayList<>();

        Stack stack = new Stack();
        for (String line : lines) {
            if ("".equals(line)) {
                stacks.add(stack);
                stack = new Stack();
            } else {
                stack.add(new Food(line));
            }
        }
        stacks.add(stack);
        return stacks;
    }
}
