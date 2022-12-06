package com.dpravos.day05;

import com.dpravos.shared.Input;
import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

import java.util.List;

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
    void input_parser_should_return_cargo_input() {
        var inputParser = new InputParser();

        var result = inputParser.cargoInput(inputGetter.day(5));

        var cargoInput = new Input("""
                    [D]   \s
                [N] [C]   \s
                [Z] [M] [P]
                 1   2   3\s
                 """);

        assertEquals(cargoInput.lines(), result);
    }

    @Test
    void cargo_parser() {
        var cargoParser = new CargoParser();

        var stack1 = new Stack();
        var stack2 = new Stack();
        var stack3 = new Stack();
        var z = new Crate("Z");
        var n = new Crate("N");
        var m = new Crate("M");
        var c = new Crate("C");
        var d = new Crate("D");
        var p = new Crate("P");
        stack1.add(z);
        stack1.add(n);
        stack2.add(m);
        stack2.add(c);
        stack2.add(d);
        stack3.add(p);

        var result = cargoParser.parse(new Input("""
                    [D]   \s
                [N] [C]   \s
                [Z] [M] [P]
                 1   2   3\s
                 """).lines());

        assertEquals(result[0].crates(), stack1.crates());
        assertEquals(result[1].crates(), stack2.crates());
        assertEquals(result[2].crates(), stack3.crates());
    }

    @Test
    void instructions_parser() {
        var lines = new Input("""
                move 1 from 2 to 1
                move 3 from 1 to 3
                move 2 from 2 to 1
                move 1 from 1 to 2
                """).lines();

        var parser = new InstructionsParser();

        var instructions = parser.parse(lines);

        var expected = List.of(
                new Instruction(1, 2, 1),
                new Instruction(3, 1, 3),
                new Instruction(2, 2, 1),
                new Instruction(1, 1, 2)
        );

        assertEquals(expected, instructions);
    }
}