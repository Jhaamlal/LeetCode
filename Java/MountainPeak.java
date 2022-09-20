package Java;

public class MountainPeak {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 3, 2, 0 };
        int res = getPeak(arr);
        System.out.println(res);

    }

    public static int getPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == 0 || mid == arr.length - 1) {
                return end;
            } else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

// Link question
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
