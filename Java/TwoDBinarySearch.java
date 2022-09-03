package Java;

import java.util.Arrays;

/**
 * TwoDBinarySearch
 */
public class TwoDBinarySearch {
    public static void main(String[] args) {
        int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 28, 29, 37, 49 }, { 33, 34, 38, 50 } };
        int target = 49;
        int[] res = search(matrix, target);
        System.out.println(Arrays.toString(res));

    }

    public static int[] search(int[][] matrix, int target) {
        int row = 0;
        // This is matrix lent can be different to make things
        int col = matrix.length - 1;
        while (row < matrix.length && col > 0) {
            if (matrix[row][col] < target) {
                row++;

            } else if (matrix[row][col] > target) {
                col--;

            } else {
                return new int[] { row, col };
            }
        }

        return new int[] { -1, -1 };
    }

}