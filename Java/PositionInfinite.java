package Java;

/**
 * PositionInfinite
 */
public class PositionInfinite {

    public static void main(String[] args) {
        int nums[] = new int[] { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;
        int res = getPosition(nums, target);
        System.out.println(res);

    }

    public static int getPosition(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while (start <= target) {
            if (nums[start] <= target && target <= nums[end]) {
                break;
            } else {
                start = end;
                end = end * 2;
            }
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}