package com.dpravos.day03;

import java.util.List;

public class Item {

    private final ItemType type;

    public Item(char ch) {
        type = new ItemType(ch);
    }

    public char value() {
        return type.value();
    }

    public static List<Item> of(String content) {
        return content.chars()
                .mapToObj(e -> new Item((char) e))
                .toList();
    }
}
