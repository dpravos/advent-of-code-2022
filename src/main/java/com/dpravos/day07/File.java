package com.dpravos.day07;

public final class File extends Node {
    private final int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "File{" +
               "name='" + name + '\'' +
               ", size=" + size +
               '}';
    }
}
