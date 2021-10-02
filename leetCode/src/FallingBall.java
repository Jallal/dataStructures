/***
 *
 * Problem: Consider an m x n grid where each (m, n) cell has an elevation represented
 * by a number between 1 and 5 (5 is the highest elevation). A ball is placed in a cell of the grid.
 * This ball can fall into another cell, as long as that cell has a smaller elevation than the ball cell.
 * The ball can fall in four directions: north, west, east, and south. Display the initial grid,
 * as well as the grid after the ball falls on all possible paths. Mark the paths with 0.
 *
 * Solution: Always pay attention to the problem requests. Notice that we must display the solved grid,
 * not list the paths or count them. The easiest way to display a grid is to use two loops,
 * as shown in the following code:
 * */

public class FallingBall {

    public static void computePath(int prevElevation, int i, int j, int rows, int cols, int[][] elevations) {

            // ensure the ball is still on the grid
        if (i >= 0 && i <= (rows - 1) && j >= 0 && j <= (cols - 1)) {

            int currentElevation = elevations[i][j];

            // check if the ball can fall
            if (prevElevation >= currentElevation && currentElevation > 0) {
                
                // store the current elevation                       
                prevElevation = currentElevation;
                // mark this cell as visited
                elevations[i][j] = 0;
                // try to move the ball
                computePath(prevElevation, i, j - 1, rows, cols, elevations);
                computePath(prevElevation, i - 1, j, rows, cols, elevations);
                computePath(prevElevation, i, j + 1, rows, cols, elevations);
                computePath(prevElevation, i + 1, j, rows, cols, elevations);
            }
        }

    }

}
