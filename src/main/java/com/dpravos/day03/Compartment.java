package com.dpravos.day03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Compartment {

    private final List<Item> items;

    public Compartment(String content) {
        this.items = Item.of(content);
    }

    public String content() {
        return items.stream().map(Item::value).map(String::valueOf).collect(Collectors.joining());
    }

    public ItemType typeInCommonWith(Compartment that) {
        List<ItemType> thisChars = this.content().chars()
                .mapToObj(e -> new ItemType((char) e))
                .toList();
        List<ItemType> thatChars = that.content().chars()
                .mapToObj(e -> new ItemType((char) e))
                .toList();

        var common = new ArrayList<>(thisChars);
        common.retainAll(thatChars);

        return common.get(0);
    }

    public List<Item> items() {
        return items;
    }
}
