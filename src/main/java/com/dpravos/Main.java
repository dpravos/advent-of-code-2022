package com.dpravos;

import com.dpravos.day01.Puzzle1;
import com.dpravos.day01.Puzzle2;
import com.dpravos.day02.Puzzle3;
import com.dpravos.day02.Puzzle4;
import com.dpravos.day03.Puzzle5;
import com.dpravos.day03.Puzzle6;
import com.dpravos.day04.Puzzle7;
import com.dpravos.day04.Puzzle8;
import com.dpravos.day05.Puzzle10;
import com.dpravos.day05.Puzzle9;
import com.dpravos.day06.Puzzle11;
import com.dpravos.day06.Puzzle12;
import com.dpravos.day07.Puzzle13;
import com.dpravos.day07.Puzzle14;
import com.dpravos.day08.Puzzle15;
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

        Puzzle10 puzzle10 = new Puzzle10(inputGetter);
        print(puzzle10.solve());

        Puzzle11 puzzle11 = new Puzzle11(inputGetter);
        print(puzzle11.solve());

        Puzzle12 puzzle12 = new Puzzle12(inputGetter);
        print(puzzle12.solve());

        Puzzle13 puzzle13 = new Puzzle13(inputGetter);
        print(puzzle13.solve());

        Puzzle14 puzzle14 = new Puzzle14(inputGetter);
        print(puzzle14.solve());

        Puzzle15 puzzle15 = new Puzzle15(inputGetter);
        print(puzzle15.solve());
    }

    private static void print(String message) {
        System.out.println(message);
    }
}