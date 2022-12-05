package com.dpravos.day05;

import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Puzzle9Test extends PuzzleTest {

    @Test
    void should_solve_example() {
        var puzzle9 = new Puzzle9(inputGetter);

        var solution = puzzle9.solve();

        assertEquals("CMZ", solution);
    }

    @Test
    void empty_stack_top_should_be_null() {
        var stack = new Stack();

        assertNull(stack.top());
    }

    @Test
    void single_crate_stack_top() {
        var stack = new Stack();
        var crate = new Crate("A");

        stack.add(crate);

        assertEquals("A", stack.top());
    }
}