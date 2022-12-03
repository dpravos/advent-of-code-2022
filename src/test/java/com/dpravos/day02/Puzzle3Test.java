package com.dpravos.day02;

import com.dpravos.day01.PuzzleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Puzzle3Test extends PuzzleTest {

    @Test
    void should_solve_example() {
        var puzzle3 = new Puzzle3(inputGetter);

        var solution = puzzle3.solve();

        assertEquals("15", solution);
    }

    @Test
    void play_a_y_should_score_8()
    {
        var round = new Round("A", "Y");

        assertEquals(8, round.score());
    }

    @Test
    void rock_wins_scissors()
    {
        assertEquals(Result.WIN, Play.ROCK.against(Play.SCISSORS));
    }

    @Test
    void minus_one_mod_3_is_2()
    {
        assertEquals(2, Math.floorMod(-1, 3));
    }

}