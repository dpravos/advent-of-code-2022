package com.dpravos.day05;

import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void crane_should_move_crates() {
        var stack1 = new Stack();
        var stack2 = new Stack();

        var crate = new Crate("A");

        stack1.add(crate);

        var stacks = new Stack[]{stack1, stack2};

        var crane = new Crane(stacks);

        crane.move(new Instruction(1, 1, 2));

        assertEquals("A", stack2.top());
        assertNull(stack1.top());
    }

    @Test
    void cargo_parser_stacks() {
        var cargoParser = new CargoParser();

        var stack1 = new Stack();
        var stack2 = new Stack();
        var stack3 = new Stack();
        var crate = new Crate("D");
        stack2.add(crate);

        var result = cargoParser.parseLine("    [D]    ");

        assertTrue(result[0].sameContentThan(stack1));
        assertTrue(result[1].sameContentThan(stack2));
        assertTrue(result[2].sameContentThan(stack3));
    }
}