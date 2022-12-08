package com.dpravos.day07.node;

import java.util.HashSet;
import java.util.Set;

public class Directory extends Node {

    public static final String ROOT_DIR = "/";
    public static final String PARENT_DIR = "..";

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

    public void add(Node node) {
        content.add(node);
        node.attachTo(this);
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

    public Directory getDirectory(String target) {
        return content.stream()
                .filter(Directory.class::isInstance)
                .map(Directory.class::cast)
                .filter(directory -> directory.withName(target))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(("""
                        Unable to find dir: %s
                        Current dir: %s
                        """).formatted(target, this)));
    }

    public File getFile(String target) {
        return content.stream()
                .filter(File.class::isInstance)
                .map(File.class::cast)
                .filter(directory -> directory.withName(target))
                .findFirst()
                .orElseThrow();
    }

    @Override
    public String toString() {
        return "Directory{" +
               "name='" + name + '\'' +
               ", content=" + content +
               '}';
    }
}
