package com.dpravos.day05;

import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Puzzle10Test extends PuzzleTest {
    @Test
    void solve_example() {
        var puzzle10 = new Puzzle10(inputGetter);

        var solution = puzzle10.solve();

        assertEquals("MCD", solution);
    }

    @Test
    void crane2() {
        var stack1 = new Stack();
        var stack2 = new Stack();

        var a = new Crate("A");
        var b = new Crate("B");

        stack1.add(b);
        stack1.add(a);

        var stacks = new Stack[]{stack1, stack2};

        var crane = new Crane2(stacks);

        crane.move(new Instruction(2, 1, 2));

        assertEquals("A", stack2.top());
        assertNull(stack1.top());
    }
}