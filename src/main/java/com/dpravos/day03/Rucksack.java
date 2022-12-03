package com.dpravos.day03;

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
}
