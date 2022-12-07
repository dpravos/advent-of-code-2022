package com.dpravos.day07;

import java.util.HashSet;
import java.util.Set;

public class Directory {

    private final String name;
    private final Set<File> files = new HashSet<>();

    public Directory(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public int size() {
        return files.stream().map(File::size).reduce(0, Integer::sum);
    }

    public void add(File file) {
        files.add(file);
    }
}
