package com.dpravos.day07;

import java.util.HashSet;
import java.util.Set;

public class Directory extends FileSystemElement {

    private final Set<FileSystemElement> content = new HashSet<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public int size() {
        return content.stream().map(FileSystemElement::size).reduce(0, Integer::sum);
    }

    public void add(FileSystemElement element) {
        content.add(element);
    }
}
