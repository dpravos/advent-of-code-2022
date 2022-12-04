package com.dpravos.day04;

import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Puzzle7Test extends PuzzleTest {

    @Test
    void should_solve_example() {
        var puzzle7 = new Puzzle7(inputGetter);

        var solution = puzzle7.solve();

        assertEquals("2", solution);
    }

    @Test
    void assignment_contains() {
        var container = new Assignment(2, 4);
        var contained = new Assignment(3, 4);

        assertTrue(container.contains(contained));
    }

    @Test
    void assignment_pair_one_contains_the_other() {
        var pair = AssignmentPair.fromLine("2-4,3-4");

        assertTrue(pair.fullOverlap());
    }
}