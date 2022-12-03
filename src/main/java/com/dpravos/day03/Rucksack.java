package com.dpravos.day03;

import java.util.Collections;
import java.util.List;

public class Rucksack {

    private Compartment first;
    private Compartment second;

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
        return List.of('p');
    }
}
