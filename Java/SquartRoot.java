package Java;

public class SquartRoot {
    public static void main(String[] args) {
        int x = 2147395599;
        int res = mySqrt(x);
        System.out.println(res);

    }

    public static int mySqrt(int x) {
        double start = 0;
        double end = x / 2 + 1;
        if (x < 2) {
            return x;
        }
        double res = 0;
        while (start <= end) {
            double mid = Math.floor(start + (end - start) / 2);
            if (mid * mid < x) {
                res = mid;
                start = mid + 1;
            } else if (mid * mid > x) {
                end = mid - 1;
            } else {
                return (int) mid;
            }
        }
        return (int) res;
    }
}
