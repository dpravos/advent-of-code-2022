package com.dpravos.shared;

import java.util.Arrays;
import java.util.List;

public record Input(String content) {
    public List<String> lines() {
        return Arrays.stream(content().split("\n")).toList();
    }
}