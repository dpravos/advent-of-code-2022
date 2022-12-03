package com.dpravos.day03;

import java.util.ArrayList;
import java.util.List;

public class Rucksack {

    private final Compartment first;
    private final Compartment second;

    public Rucksack(String content) {
        first = new Compartment(content.substring(0, content.length() / 2));
        second = new Compartment(content.substring(content.length() / 2));
    }

    public Compartment first() {
        return first;
    }

    public Compartment second() {
        return second;
    }

    public List<Character> repeated() {
        List<Character> firstChars = first.content().chars()
                .mapToObj(e -> (char) e)
                .toList();
        List<Character> secondChars = second.content().chars()
                .mapToObj(e -> (char) e)
                .toList();

        var common = new ArrayList<>(firstChars);
        common.retainAll(secondChars);

        return common;
    }
}
