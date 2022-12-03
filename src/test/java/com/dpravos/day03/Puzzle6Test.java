package com.dpravos.day03;

import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Puzzle6Test extends PuzzleTest {

    @Test
    void should_solve_example() {
        var puzzle6 = new Puzzle6(inputGetter);

        var solution = puzzle6.solve();

        assertEquals("70", solution);
    }
}