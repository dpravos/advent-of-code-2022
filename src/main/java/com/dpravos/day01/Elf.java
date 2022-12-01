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


    public int calories() {
        return stack.calories();
    }
}

class Food {

    private final String calories;

    Food(String calories) {
        this.calories = calories;
    }

    public int calories() {
        return Integer.parseInt(calories);
    }
}

class Stack {

    private final List<Food> foods = new ArrayList<>();

    public void add(Food food) {
        foods.add(food);
    }

    public int calories() {
        return foods.stream().map(Food::calories).reduce(0, Integer::sum);
    }
}