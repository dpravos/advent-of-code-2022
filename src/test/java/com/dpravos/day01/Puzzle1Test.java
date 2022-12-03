package com.dpravos.day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Puzzle1Test extends PuzzleTest {

    @Test
    void should_solve_example() {
        var puzzle1 = new Puzzle1(inputGetter);

        var solution = puzzle1.solve();

        assertEquals("24000", solution);
    }

    @Test
    void should_have_5_elves() {
        var elves = Elf.fromInput(inputGetter.day(1));

        assertEquals(5, elves.size());
    }

    @Test
    void first_elf_should_have_6k_calories() {
        var elves = Elf.fromInput(inputGetter.day(1));

        var firstElf = elves.get(0);

        assertEquals(6000, firstElf.calories());
    }
}