package com.dpravos.day03;

import com.dpravos.day01.PuzzleTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Puzzle5Test extends PuzzleTest {

    @Test
    void should_solve_solution() {
        var puzzle5 = new Puzzle5(inputGetter);

        var solution = puzzle5.solve();

        assertEquals("157", solution);
    }

    @Test
    void first_half_of_rucksack_content_should_be_stored_in_first_compartment()
    {
        var content = "vJrwpWtwJgWrhcsFMMfFFhFp";
        var rucksack = new Rucksack(content);

        assertEquals(new Compartment("vJrwpWtwJgWr"), rucksack.first());
    }

    @Test
    void second_half_of_rucksack_content_should_be_stored_in_second_compartment()
    {
        var content = "vJrwpWtwJgWrhcsFMMfFFhFp";
        var rucksack = new Rucksack(content);

        assertEquals(new Compartment("hcsFMMfFFhFp"), rucksack.second());
    }

    @Test
    void should_detect_repeated_item_types_in_compartments() {
        var content = "vJrwpWtwJgWrhcsFMMfFFhFp";
        var rucksack = new Rucksack(content);

        assertEquals(List.of('p'), rucksack.repeated());
    }
}