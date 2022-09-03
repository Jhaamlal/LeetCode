package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[] rnos = new int[5];
        int[] rs = { 1, 2, 3, 5, 6, 8 };
        // System.out.println(rs[3]);

        // for (int i : rs) {
        // System.out.println(i);
        // }
        // int[][] arr = new int[3][];.

        int n = 1;
        for (int i = 0; i < rs.length / 2; i++) {
            int temp = rs[i];
            rs[i] = rs[rs.length - n];
            rs[rs.length - n] = temp;
            n++;

        }
        System.out.println(Arrays.toString(rs));
        int[][] arr2D = {
                { 1, 2, 3, 4 },
                { 4, 5 },
                { 5, 4, 23, 4 }
        };
        // for (int[] is : arr2D) {
        // System.out.println(Arrays.toString(is));
        // }

        int[][] arr1 = new int[3][2];
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col]);
            }
            System.out.println();
        }

        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.set(2, 100);
        System.out.println(list);

        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>(4);

        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1.get(i).add(j);
            }
            System.out.println(list1);
        }

    }
}