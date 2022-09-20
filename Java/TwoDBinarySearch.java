package Java;

import java.util.Arrays;

/**
 * TwoDBinarySearch
 */
public class TwoDBinarySearch {
    public static void main(String[] args) {
        int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 28, 29, 37, 49 }, { 33, 34, 38, 50 } };
        int target = 37;
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        int[] res = search1(matrix, target);
        System.out.println(Arrays.toString(res));

    }

    public static int[] search(int[][] matrix, int target) {
        int row = 0;
        // This is matrix lent can be different to make things
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            System.out.println(matrix[row][col]);
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

    // Let's try to do with the things
    // Here what we did is that change the way we do binary search to other form row
    // last and first column
    public static int[] search1(int[][] matrix, int target) {
        int row = matrix[0].length - 1;
        int col = 0;
        while (col < matrix[0].length && row >= 0) {
            System.out.println(matrix[row][col]);
            if (matrix[row][col] < target) {
                col++;
            } else if (matrix[row][col] > target) {
                row--;
            } else {
                return new int[] { row, col };
            }
        }

        return new int[] { -1, -1 };
    }

}