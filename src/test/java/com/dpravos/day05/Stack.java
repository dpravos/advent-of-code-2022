package com.dpravos.day05;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private final List<Crate> crates = new ArrayList<>();

    public String top() {
        return !crates.isEmpty()
                ? crates.get(crates.size() - 1).value()
                : null;

    }

    public void add(Crate crate) {
        crates.add(crate);
    }
}
