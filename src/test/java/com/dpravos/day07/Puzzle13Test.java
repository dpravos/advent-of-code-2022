package com.dpravos.day07;

import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

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
}