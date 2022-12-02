package com.dpravos.day02;

import com.dpravos.shared.ExampleInputGetter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Puzzle3Test {

    @Test
    void should_solve_example() {
        ExampleInputGetter inputGetter = new ExampleInputGetter();
        Puzzle3 puzzle3 = new Puzzle3(inputGetter);

        String solution = puzzle3.solve();

        assertEquals("15", solution);
    }

    @Test
    void play_a_y_should_score_8()
    {
        Round round = new Round("A", "Y");

        assertEquals(8, round.score());
    }

    @Test
    void rock_wins_scissors()
    {
        assertEquals(Result.WIN, Play.ROCK.against(Play.SCISSORS));
    }

}