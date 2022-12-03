package com.dpravos.day01;

import com.dpravos.shared.Input;

import java.util.ArrayList;
import java.util.List;

public class Elf {

    private final Stack stack;

    public Elf(Stack stack) {
        this.stack = stack;
    }

    public static List<Elf> fromInput(Input input) {
        List<Stack> stacks = parseInput(input);
        return stacks.stream().map(Elf::new).toList();
    }

    public int calories() {
        return stack.calories();
    }

    private static List<Stack> parseInput(Input input) {
        List<String> lines = input.lines();

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
