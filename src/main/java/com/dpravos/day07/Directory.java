package com.dpravos.day07;

import java.util.HashSet;
import java.util.Set;

public class Directory extends Node {

    public static final String ROOT_DIR = "/";
    private final Set<Node> content = new HashSet<>();

    public Directory(String name) {
        super(name);
    }

    public static Directory root() {
        return new Directory(ROOT_DIR);
    }

    @Override
    public int size() {
        return content.stream().map(Node::size).reduce(0, Integer::sum);
    }

    public void add(Node element) {
        content.add(element);
    }

    public Set<Directory> directories() {
        Set<Directory> directories = new HashSet<>();
        directories.add(this);
        content.stream().filter(Directory.class::isInstance)
                .map(Directory.class::cast)
                .map(Directory::directories)
                .forEach(directories::addAll);

        return directories;
    }
}
