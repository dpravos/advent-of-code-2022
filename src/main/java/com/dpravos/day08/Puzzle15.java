package com.dpravos.day08;

import com.dpravos.shared.InputGetter;
import com.dpravos.shared.Puzzle;

public class Puzzle15 extends Puzzle {

    public Puzzle15(InputGetter inputGetter) {
        super(inputGetter);
    }

    @Override
    public String solve() {
        InputParser inputParser = new InputParser();

        int[][] grid = inputParser.parse(inputGetter.day(8));

        TreeGrid treeGrid = new TreeGrid(grid);

        int visibleTrees = treeGrid.visibleTrees();

        return String.valueOf(visibleTrees);
    }
}
