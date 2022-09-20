package Java;

import java.util.Arrays;

public class MaxValEq {
    public static void main(String[] args) {
        int[][] points = { { -19, -12 },
                { -13, -18 },
                { -12, 18 },
                { -11, -8 },
                { -8, 2 },
                { -7, 12 },
                { -5, 16 },
                { -3, 9 },
                { 1, -7 },
                { 5, -4 },
                { 6, -20 },
                { 10, 4 },
                { 16, 4 },
                { 19, -9 },
                { 20, 19 }, };

        int k = 26;
        int x = findMaxValueOfEquation(points, k);
        System.out.println(x);

    }

    public static int findMaxValueOfEquation(int[][] points, int k) {
        int ans = Integer.MIN_VALUE;
        int i = 0;
        int f = 1;
        while (i < points.length) {
            if (f < i + 1)
                f = i + 1;
            for (int j = f; j <= points.length - 1; j++) {
                // System.out.println(points[j][0]);
                // System.out.println(points[i][0]);
                if (points[j][0] > (points[i][0] + k))
                    break;
                if ((points[i][1] + points[j][1] + points[j][0] - points[i][0]) > ans) {
                    ans = points[i][1] + points[j][1] + points[j][0] - points[i][0];
                    f = j - 1;

                    int[] arr = { points[i][0], points[j][0], ans };
                    System.out.println(Arrays.toString(arr));
                }
            }
            i++;
        }
        return ans;
    }
}

class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int i = 0, max = -1000000000, f = k + 1;
        int j = i + 1;
        while (i < points.length - 1) {
            // System.out.println("i "+i+" max "+ max +" j "+j);
            if (j < points.length) {
                f = points[j][0] - points[i][0];
            }
            if (f <= k && j < points.length) {
                if (max < points[i][1] + points[j][1] + f) {
                    max = points[i][1] + points[j][1] + f;
                }
                j++;
            } else {
                i++;
                j = i + 1;
            }
        }
        return max;
    }
}
