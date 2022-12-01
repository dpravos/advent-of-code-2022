package com.dpravos.day01;

import com.dpravos.shared.ExampleInputGetter;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Puzzle1Test {

    @Test
    void should_solve_example() {
        ExampleInputGetter inputGetter = new ExampleInputGetter();
        Puzzle1 puzzle1 = new Puzzle1(inputGetter);

        String solution = puzzle1.solve();

        assertEquals("24000", solution);
    }

    @Test
    void should_have_5_elves() {
        ExampleInputGetter inputGetter = new ExampleInputGetter();

        List<Elf> elves = Elf.fromInput(inputGetter.day(1));

        assertEquals(5, elves.size());
    }

    @Test
    void first_elf_should_have_6k_calories() {
        ExampleInputGetter inputGetter = new ExampleInputGetter();

        List<Elf> elves = Elf.fromInput(inputGetter.day(1));

        Elf firstElf = elves.get(0);

        assertEquals(6000, firstElf.calories());
    }
}