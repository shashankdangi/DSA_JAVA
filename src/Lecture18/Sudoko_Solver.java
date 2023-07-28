package Lecture18;

public class Sudoko_Solver {
    public static void main(String[] args) {
        int[][] arr = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};

        SudokuSolver(arr, 0, 0);

    }

    static void SudokuSolver(int[][] arr, int row, int col) {
        if (col == 9) {
            row++;
            col = 0;
        }
        if (row == 9) {
            Display(arr);
            return;
        }
        if (arr[row][col] != 0) {
            SudokuSolver(arr, row, col + 1);
        } else {
            for (int val = 1; val <= 9; val++) {
                if (issafe(arr, row, col, val)) {
                    arr[row][col] = val;
                    SudokuSolver(arr, row, col + 1);
                    arr[row][col] = 0;
                }
            }
        }
    }

    static boolean issafe(int[][] arr, int row, int col, int val) {

        //col
        int c = col;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][c] == val) {
                return false;
            }
        }

        //row
        int r = row;
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[r][j] == val) {
                return false;
            }
        }

        //check 3x3
        r = row - row % 3;
        c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (arr[i][j] == val) {
                    return false;
                }

            }
        }


        return true;
    }

    static void Display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
