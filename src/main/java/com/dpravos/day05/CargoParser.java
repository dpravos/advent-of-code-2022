package com.dpravos.day05;

import java.util.List;
import java.util.stream.IntStream;

public class CargoParser {

    public Stack[] parse(List<String> cargo) {
        var filled = cargo.stream().map(line -> line + " ").toList();
        var withoutLabels = filled.subList(0, filled.size() - 1);
        var stacks = IntStream.range(0, filled.get(0).length() / 4)
                .mapToObj(i -> new Stack())
                .toArray(Stack[]::new);

        for (int j = withoutLabels.size(); j-- > 0; ) {
            for (int i = 0; i < stacks.length; i++) {
                var crateLetter = withoutLabels.get(j).substring(4 * i, 4 * i + 3).charAt(1);
                if (!Character.isWhitespace(crateLetter)) {
                    stacks[i].add(new Crate(String.valueOf(crateLetter)));
                }
            }
        }

        return stacks;
    }
}
