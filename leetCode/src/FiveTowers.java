import java.util.Set;

/***
 * Problem: Consider a 5x5 grid with five defensive towers spread across the grid.
 * To provide an optimal defense for the grid, we have to build a tower on each row of the grid.
 * Find all the solutions for building these towers so that none of them share the same column and diagonal.
 *
 * Solution: We know that, on each row, we must build a tower and that it is not important in what order
 * we build them on the grid. Let's sketch a solution and a failure, as follows:
 *
 * */


public class FiveTowers {


    protected static final int GRID_SIZE = 5; // (5x5)

    public static void buildTowers(int row, Integer[] columns, Set<Integer[]> solutions) {

        if (row == GRID_SIZE) {
            solutions.add(columns.clone());

        } else {

            for (int col = 0; col < GRID_SIZE; col++) {

                if (canBuild(columns, row, col)) {

                    // build this tower
                    columns[row] = col;

                    // go to the next row
                    buildTowers(row + 1, columns, solutions);

                }

            }

        }

    }

    private static boolean canBuild(Integer[] columns,

                                    int nextRow, int nextColumn) {

        for (int currentRow = 0; currentRow < nextRow; currentRow++) {

            int currentColumn = columns[currentRow];

            // cannot build on the same column
            if (currentColumn == nextColumn) {
                return false;

            }
            int columnsDistance = Math.abs(currentColumn - nextColumn);

            int rowsDistance = nextRow - currentRow;

            // cannot build on the same diagonal
            if (columnsDistance == rowsDistance) {
                return false;
            }

        }

        return true;

    }


}
