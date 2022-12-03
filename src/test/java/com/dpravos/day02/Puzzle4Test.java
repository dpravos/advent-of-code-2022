package com.dpravos.day02;

import com.dpravos.day01.PuzzleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Puzzle4Test extends PuzzleTest {
    @Test
    void should_solve_example() {
        var puzzle4 = new Puzzle4(inputGetter);

        var solution = puzzle4.solve();

        assertEquals("12", solution);
    }

    @Test
    void given_rock_for_draw_should_be_rock() {
        var play = Play.ROCK.suchThat(ResultV2.DRAW);

        assertEquals(Play.ROCK, play);
    }

    @Test
    void given_rock_for_win_should_be_paper() {
        var play = Play.ROCK.suchThat(ResultV2.WIN);

        assertEquals(Play.PAPER, play);
    }

    @Test
    void given_rock_for_lose_should_be_scissors() {
        var play = Play.ROCK.suchThat(ResultV2.LOSE);

        assertEquals(Play.SCISSORS, play);
    }
}