package com.dpravos;

import com.dpravos.day01.Puzzle1;
import com.dpravos.shared.HttpInputGetter;

public class Main {
    public static void main(String[] args) {
        HttpInputGetter inputGetter = new HttpInputGetter();

        Puzzle1 puzzle1 = new Puzzle1(inputGetter);
        print(puzzle1.solve());
    }

    private static void print(String message) {
        System.out.println(message);
    }
}