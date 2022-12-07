package com.dpravos.day06;

import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Puzzle11Test extends PuzzleTest {

    @Test
    void should_solve_example() {
        var puzzle = new Puzzle11(inputGetter);

        var solution = puzzle.solve();

        assertEquals("7", solution);
    }

    @Test
    void characters_unique() {
        var signal = "abcd";

        var distinctChars = signal.chars().distinct().toArray();
        var distinctString = new String(distinctChars, 0, distinctChars.length);

        assertEquals(signal, distinctString);
    }

    @Test
    void should_find_signal_marker() {
        var signal = Signal.of("abcd");

        var marker = signal.startOfPacketMarker();

        assertEquals(4, marker);
    }

    @Test
    void should_find_signal_marker_2() {
        var signal = Signal.of("aabcd");

        var marker = signal.startOfPacketMarker();

        assertEquals(5, marker);
    }
}