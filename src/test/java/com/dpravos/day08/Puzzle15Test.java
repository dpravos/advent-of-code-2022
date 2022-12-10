package com.dpravos.day08;

import com.dpravos.shared.Input;
import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Puzzle15Test extends PuzzleTest {

    @Test
    void should_solve_example() {
        Puzzle15 puzzle15 = new Puzzle15(inputGetter);

        String solution = puzzle15.solve();

        assertEquals("21", solution);
    }

    @Test
    void input_should_return_a_matrix() {
        Input input = inputGetter.day(8);

        InputParser inputParser = new InputParser();

        int[][] grid = inputParser.parse(input);

        assertEquals(5, grid.length);
        assertEquals(5, grid[0].length);
    }

    @Test
    void grid_of_4_should_return_4_visible() {
        int[][] grid = new int[][]{
          new int[]{7, 2},
          new int[]{3, 1},
        };

        TreeGrid treeGrid = new TreeGrid(grid);

        assertEquals(4, treeGrid.visibleTrees());
    }

    @Test
    void grid_of_9_with_long_center_should_return_9_visible() {
        int[][] grid = new int[][]{
                new int[]{7, 2, 3},
                new int[]{3, 9, 1},
                new int[]{2, 2, 4},
        };

        TreeGrid treeGrid = new TreeGrid(grid);

        assertEquals(9, treeGrid.visibleTrees());
    }

    @Test
    void grid_of_9_with_short_center_should_return_8_visible() {
        int[][] grid = new int[][]{
                new int[]{7, 2, 3},
                new int[]{3, 1, 5},
                new int[]{2, 9, 4},
        };

        TreeGrid treeGrid = new TreeGrid(grid);

        assertEquals(8, treeGrid.visibleTrees());
    }
}