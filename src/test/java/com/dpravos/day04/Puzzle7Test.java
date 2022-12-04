package com.dpravos.day04;

import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Puzzle7Test extends PuzzleTest {

    @Test
    void should_solve_example() {
        var puzzle7 = new Puzzle7(inputGetter);

        var solution = puzzle7.solve();

        assertEquals("2", solution);
    }
}