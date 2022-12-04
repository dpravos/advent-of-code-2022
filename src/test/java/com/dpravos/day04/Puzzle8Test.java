package com.dpravos.day04;

import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Puzzle8Test extends PuzzleTest {

    @Test
    void should_solve_example() {
        var puzzle8 = new Puzzle8(inputGetter);

        var solution = puzzle8.solve();

        assertEquals("4", solution);
    }
}