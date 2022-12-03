package com.dpravos.day03;

import java.util.ArrayList;

public record Group(Rucksack first, Rucksack second, Rucksack third) {

    public static Group fromContent(String first, String second, String third) {
        return new Group(new Rucksack(first), new Rucksack(second), new Rucksack(third));
    }

    public int priority() {
        var firstTypes = first.items().stream().map(Item::type).toList();
        var secondTypes = second.items().stream().map(Item::type).toList();
        var thirdTypes = third.items().stream().map(Item::type).toList();

        var common = new ArrayList<>(firstTypes);
        common.retainAll(secondTypes);
        common.retainAll(thirdTypes);

        var unique = common.stream().distinct().toList();

        if (unique.size() != 1) {
            throw new RuntimeException("Error obtaining badge.");
        }

        return common.get(0).priority();
    }
}
