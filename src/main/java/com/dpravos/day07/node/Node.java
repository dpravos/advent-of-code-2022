package com.dpravos.day07.node;

public abstract class Node {
    protected final String name;
    private Directory parent = null;

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

    public Directory parent() {
        return parent;
    }

    protected void attachTo(Directory parent) {
        this.parent = parent;
    }
}
