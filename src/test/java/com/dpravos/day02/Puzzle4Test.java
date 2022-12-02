package com.dpravos.day02;

import com.dpravos.shared.ExampleInputGetter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Puzzle4Test {
    @Test
    void should_solve_example() {
        ExampleInputGetter inputGetter = new ExampleInputGetter();
        Puzzle4 puzzle4 = new Puzzle4(inputGetter);

        String solution = puzzle4.solve();

        assertEquals("12", solution);
    }

    @Test
    void given_rock_for_draw_should_be_rock() {
        Play play = Play.ROCK.suchThat(ResultV2.DRAW);

        assertEquals(Play.ROCK, play);
    }

    @Test
    void given_rock_for_win_should_be_paper() {
        Play play = Play.ROCK.suchThat(ResultV2.WIN);

        assertEquals(Play.PAPER, play);
    }

    @Test
    void given_rock_for_lose_should_be_scissors() {
        Play play = Play.ROCK.suchThat(ResultV2.LOSE);

        assertEquals(Play.SCISSORS, play);
    }
}