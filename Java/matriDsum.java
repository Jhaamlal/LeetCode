/**
 * matriDsum
 */
package Java;

import java.util.Arrays;

public class matriDsum {

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int res = diagonalSum(mat);
        System.out.println(res);

    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    sum = sum + mat[i][j];
                } else if (i + j == (mat.length - 1)) {
                    sum = sum + mat[i][j];
                }
            }
        }

        return sum;

    }
}