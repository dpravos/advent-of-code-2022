package com.dpravos.day07;

public abstract class Node {
    protected final String name;

    public Node(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public abstract int size();
}
