package com.dpravos.day05;

import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Puzzle9Test extends PuzzleTest {

    @Test
    void should_solve_example() {
        var puzzle9 = new Puzzle9(inputGetter);

        var solution = puzzle9.solve();

        assertEquals("CMZ", solution);
    }
}