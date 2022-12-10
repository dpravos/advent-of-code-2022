package com.dpravos.day08;

import java.util.Arrays;

public class TreeGrid {
    private final int[][] grid;

    public TreeGrid(int[][] grid) {
        this.grid = grid;
    }

    public int visibleTrees() {
        int count = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (isVisible(row, col)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isVisible(int rowIndex, int colIndex) {
        int[] row = grid[rowIndex];
        var col = Arrays.stream(grid).mapToInt(aRow -> aRow[colIndex]).toArray();

        if (rowIndex == 0 || rowIndex == grid.length - 1 || colIndex == 0 || colIndex == row.length - 1) {
            return true;
        }

        var leftRow = Arrays.copyOfRange(row, 0, colIndex);
        var rightRow = Arrays.copyOfRange(row, colIndex + 1, row.length);
        var topColumn = Arrays.copyOfRange(col, 0, rowIndex);
        var bottomColumn = Arrays.copyOfRange(col, rowIndex + 1, col.length);

        int selectedTree = grid[rowIndex][colIndex];

        return isHigherThanSegment(selectedTree, leftRow)
               || isHigherThanSegment(selectedTree, rightRow)
               || isHigherThanSegment(selectedTree, topColumn)
               || isHigherThanSegment(selectedTree, bottomColumn);
    }

    private static boolean isHigherThanSegment(int selected, int[] segment) {
        return Arrays.stream(segment).filter(tree -> tree >= selected).count() == 0;
    }
}
