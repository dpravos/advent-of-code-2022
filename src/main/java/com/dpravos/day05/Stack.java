package com.dpravos.day05;

import java.util.LinkedList;

public class Stack {

    private final LinkedList<Crate> crates = new LinkedList<>();

    public String top() {
        return !crates.isEmpty()
                ? crates.getLast().value()
                : null;

    }

    public void add(Crate crate) {
        crates.add(crate);
    }

    public Crate extract() {
        return crates.removeLast();
    }
}
