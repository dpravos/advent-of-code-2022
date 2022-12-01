package com.dpravos.day01;

import com.dpravos.shared.ExampleInputGetter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Puzzle2Test {

    @Test
    void should_solve_example() {
        ExampleInputGetter inputGetter = new ExampleInputGetter();
        Puzzle2 puzzle2 = new Puzzle2(inputGetter);

        String solution = puzzle2.solve();

        assertEquals("45000", solution);
    }
}