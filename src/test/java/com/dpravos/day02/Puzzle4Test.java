package com.dpravos.day02;

import com.dpravos.shared.ExampleInputGetter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Puzzle4Test {
    @Test
    void should_solve_example() {
        ExampleInputGetter inputGetter = new ExampleInputGetter();
        Puzzle4 puzzle4 = new Puzzle4(inputGetter);

        String solution = puzzle4.solve();

        assertEquals("12", solution);
    }
}