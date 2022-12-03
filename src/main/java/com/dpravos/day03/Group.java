package com.dpravos.day03;

public record Group(Rucksack first, Rucksack second, Rucksack third) {

    public static Group fromContent(String first, String second, String third) {
        return new Group(new Rucksack(first), new Rucksack(second), new Rucksack(third));
    }

    public int priority() {
        var unique = first.types().stream()
                .filter(second.types()::contains)
                .filter(third.types()::contains)
                .distinct()
                .toList();

        if (unique.size() != 1) {
            throw new RuntimeException("Error obtaining badge.");
        }

        return unique.get(0).priority();
    }
}
