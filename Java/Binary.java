public class Binary {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 7, 8, 10, 45, 65 };
        int target = 10;
        int searchRes = search(arr, target);
        int seaRes = AgnositicSearch(arr, target);
        System.out.println(searchRes);
        System.out.println(seaRes);

    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Find the middle value
            int mid = start + (end - start) / 2;

            // target is less then ,then remove end
            if (target < arr[mid]) {
                end = mid - 1;
                // target is more then
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // Order agnostic search
    public static int AgnositicSearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = true;

        if (arr[start] > arr[end]) {
            isAsc = false;
        }

        if (isAsc) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }

            }
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
