package com.dpravos.day06;

import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Puzzle12Test extends PuzzleTest {

    @Test
    void should_solve_example() {
        var puzzle = new Puzzle12(inputGetter);

        var solution = puzzle.solve();

        assertEquals("19", solution);
    }
}