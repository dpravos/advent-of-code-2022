package com.dpravos.day02;

import java.util.HashMap;
import java.util.Map;

enum ResultV2 {
    WIN(6, "Z"),
    DRAW(3, "Y"),
    LOSE(0, "X");

    private final int score;
    private final String label;

    ResultV2(int score, String label) {
        this.score = score;
        this.label = label;
    }

    public int score() {
        return score;
    }

    private static final Map<String, ResultV2> results = new HashMap<>();
    static {
        for (ResultV2 value : ResultV2.values()) {
            results.put(value.label, value);
        }
    }

    public static ResultV2 of(String label) {
        return results.get(label);
    }
}
