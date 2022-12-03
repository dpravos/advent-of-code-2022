package com.dpravos.day01;

import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Puzzle2Test extends PuzzleTest {

    @Test
    void should_solve_example() {
        var puzzle2 = new Puzzle2(inputGetter);

        var solution = puzzle2.solve();

        assertEquals("45000", solution);
    }
}