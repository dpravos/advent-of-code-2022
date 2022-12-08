package com.dpravos.day07;

import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Puzzle14Test extends PuzzleTest {

    @Test
    void solve() {
        var puzzle = new Puzzle14(inputGetter);

        var solution = puzzle.solve();

        assertEquals("24933642", solution);
    }
}