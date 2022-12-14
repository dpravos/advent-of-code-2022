package com.dpravos.day03;

import java.util.List;
import java.util.stream.Stream;

public class Rucksack {

    private final Compartment first;
    private final Compartment second;

    public Rucksack(String content) {
        first = new Compartment(content.substring(0, content.length() / 2));
        second = new Compartment(content.substring(content.length() / 2));
    }

    List<ItemType> types() {
        return items().stream().map(Item::type).toList();
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

    public List<Item> items() {
        return Stream.concat(first.items().stream(), second.items().stream()).toList();
    }
}
