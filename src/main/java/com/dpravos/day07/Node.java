package com.dpravos.day07;

public abstract class Node {
    protected final String name;

    public Node(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    protected boolean withName(String target) {
        return name.equals(target);
    }

    public abstract int size();
}
