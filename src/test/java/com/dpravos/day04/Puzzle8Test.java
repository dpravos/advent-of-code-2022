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

    @Test
    void assignment_overlaps() {
        var anAssignment = new Assignment(2, 3);
        var anotherAssignment = new Assignment(3, 5);

        assertTrue(anAssignment.overlaps(anotherAssignment));
        assertTrue(anotherAssignment.overlaps(anAssignment));
    }

    @Test
    void assignment_not_overlaps() {
        var anAssignment = new Assignment(2, 3);
        var anotherAssignment = new Assignment(4, 5);

        assertFalse(anAssignment.overlaps(anotherAssignment));
        assertFalse(anotherAssignment.overlaps(anAssignment));
    }

    @Test
    void assignment_pair_overlaps() {
        var pair = AssignmentPair.fromLine("5-7,7-9");

        assertTrue(pair.overlaps());
    }
}