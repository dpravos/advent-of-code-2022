package com.dpravos.day07;

public abstract class FileSystemElement {
    protected final String name;

    public FileSystemElement(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public abstract int size();
}
