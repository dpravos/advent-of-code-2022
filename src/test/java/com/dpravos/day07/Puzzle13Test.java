package com.dpravos.day07;

import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class Puzzle13Test extends PuzzleTest {

    @Test
    void should_solve_example() {
        var puzzle = new Puzzle13(inputGetter);

        var solution = puzzle.solve();

        assertEquals("95437", solution);
    }

    @Test
    void should_get_size_of_directory() {
        var directory = new Directory("d");
        var file = new File("file", 10);
        directory.add(file);

        assertEquals(10, directory.size());

    }

    @Test
    void should_get_size_of_nested_directories() {
        var parent = new Directory("parent");
        var child = new Directory("child");
        var file = new File("file", 10);
        child.add(file);
        parent.add(child);

        assertEquals(10, parent.size());
    }

    @Test
    void should_list_all_directories_in_a_filesystem() {
        var root = new Directory("/");
        var a = new Directory("a");
        var e = new Directory("e");
        var i = new File("i", 584);
        var f = new File("f", 29116);
        var d = new Directory("d");
        var j = new File("j", 4060174);
        e.add(i);
        a.add(e);
        a.add(f);
        root.add(a);
        d.add(j);
        root.add(d);

        var directories = root.directories();

        var expected = Set.of(root, a, e, d);

        assertEquals(expected, directories);
    }
}