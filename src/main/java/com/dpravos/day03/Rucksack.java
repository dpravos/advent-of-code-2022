package com.dpravos.day03;

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

    public ItemType repeated() {
        return first.typeInCommonWith(second);
    }

    public int priority() {
        return repeated().priority();
    }
}
