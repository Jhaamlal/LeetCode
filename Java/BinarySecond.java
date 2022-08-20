package Java;

/**
 * Ceiling
 */
public class BinarySecond {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int target = 3;
        long start = System.nanoTime();
        int val = getCelling(arr, target);
        long time = System.nanoTime() - start;
        System.out.println(time);
        System.out.println(val);
    }

    static int getCelling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        if (target > mid) {
            start = mid + 1;
        } else if (target < mid) {
            end = mid - 1;
        } else {
            return mid;
        }
        return -1;
    }
}