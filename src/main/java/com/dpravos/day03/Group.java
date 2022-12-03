package com.dpravos.day03;

public record Group(Rucksack first, Rucksack second, Rucksack third) {

    public static Group fromContent(String first, String second, String third) {
        return new Group(new Rucksack(first), new Rucksack(second), new Rucksack(third));
    }

    public int priority() {
        return 18;
    }
}
