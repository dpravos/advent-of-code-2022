package com.dpravos.day05;

import com.dpravos.shared.Input;

import java.util.List;

public class InputParser {
    public List<String> cargoInput(Input input) {
        return input.lines().subList(0, blankLineIndex(input));
    }

    public List<String> instructionsInput(Input input) {
        return input.lines().subList(blankLineIndex(input) + 1, input.lines().size());
    }

    private static int blankLineIndex(Input input) {
        var blankLine = input.lines().stream()
                .filter(line -> line.trim().isEmpty())
                .findFirst()
                .orElseThrow();

        return input.lines().indexOf(blankLine);
    }
}
