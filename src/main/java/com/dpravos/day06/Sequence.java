package com.dpravos.day06;

public record Sequence(String value) {
    public boolean isDistinct() {
        var distinctChars = value().chars().distinct().toArray();
        var distinctString = new String(distinctChars, 0, distinctChars.length);

        return value().equals(distinctString);
    }
}