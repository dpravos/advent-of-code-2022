package com.dpravos.day03;

public record ItemType(char value) {

    public int priority() {
        return Character.isUpperCase(value)
                ? value - 38
                : value - 96;
    }
}
