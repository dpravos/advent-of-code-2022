package com.dpravos.day03;

import java.util.List;
import java.util.stream.Collectors;

public class Compartment {

    private final List<Item> items;

    public Compartment(String content) {
        this.items = Item.of(content);
    }

    private List<ItemType> types() {
        return items.stream()
                .map(Item::type)
                .toList();
    }

    public String content() {
        return items.stream().map(Item::value).map(String::valueOf).collect(Collectors.joining());
    }

    public ItemType typeInCommonWith(Compartment that) {
        return this.types().stream()
                .filter(that.types()::contains)
                .distinct()
                .toList()
                .get(0);
    }

    public List<Item> items() {
        return items;
    }
}
