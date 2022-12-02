package com.dpravos;

import com.dpravos.day01.Puzzle1;
import com.dpravos.day01.Puzzle2;
import com.dpravos.day02.Puzzle3;
import com.dpravos.day02.Puzzle4;
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
    }

    private static void print(String message) {
        System.out.println(message);
    }
}