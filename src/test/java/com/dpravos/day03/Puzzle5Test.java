package com.dpravos.day03;

import com.dpravos.day01.PuzzleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Puzzle5Test extends PuzzleTest {

    @Test
    void should_solve_solution() {
        var puzzle5 = new Puzzle5(inputGetter);

        var solution = puzzle5.solve();

        assertEquals("157", solution);
    }
}