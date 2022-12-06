package com.dpravos.day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

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

    public List<Crate> extract(int quantity) {
        List<Crate> extracted = IntStream.range(0, quantity)
                .mapToObj(i -> crates.removeLast())
                .toList();
        var reverse = new ArrayList<>(extracted);
        Collections.reverse(reverse);
        return reverse;
    }

    public LinkedList<Crate> crates() {
        return crates;
    }

    public void addAll(List<Crate> crates) {
        this.crates.addAll(crates);
    }
}
