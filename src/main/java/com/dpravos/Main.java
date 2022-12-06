package com.dpravos;

import com.dpravos.day01.Puzzle1;
import com.dpravos.day01.Puzzle2;
import com.dpravos.day02.Puzzle3;
import com.dpravos.day02.Puzzle4;
import com.dpravos.day03.Puzzle5;
import com.dpravos.day03.Puzzle6;
import com.dpravos.day04.Puzzle7;
import com.dpravos.day04.Puzzle8;
import com.dpravos.day05.Puzzle9;
import com.dpravos.shared.HttpInputGetter;

public class Main {
    public static void main(String[] args) {
        HttpInputGetter inputGetter = new HttpInputGetter();

        Puzzle1 puzzle1 = new Puzzle1(inputGetter);
        print(puzzle1.solve());

        Puzzle2 puzzle2 = new Puzzle2(inputGetter);
        print(puzzle2.solve());

        Puzzle3 puzzle3 = new Puzzle3(inputGetter);
        print(puzzle3.solve());

        Puzzle4 puzzle4 = new Puzzle4(inputGetter);
        print(puzzle4.solve());

        Puzzle5 puzzle5 = new Puzzle5(inputGetter);
        print(puzzle5.solve());

        Puzzle6 puzzle6 = new Puzzle6(inputGetter);
        print(puzzle6.solve());

        Puzzle7 puzzle7 = new Puzzle7(inputGetter);
        print(puzzle7.solve());

        Puzzle8 puzzle8 = new Puzzle8(inputGetter);
        print(puzzle8.solve());

        Puzzle9 puzzle9 = new Puzzle9(inputGetter);
        print(puzzle9.solve());
    }

    private static void print(String message) {
        System.out.println(message);
    }
}