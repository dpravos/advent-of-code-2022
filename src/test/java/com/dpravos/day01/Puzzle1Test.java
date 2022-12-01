package com.dpravos.day01;

import com.dpravos.shared.ExampleInputGetter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Puzzle1Test {

    @Test
    void should_solve_example() {
        ExampleInputGetter inputGetter = new ExampleInputGetter();
        Puzzle1 puzzle1 = new Puzzle1(inputGetter);

        String solution = puzzle1.solve();

        assertEquals("24000", solution);
    }
}