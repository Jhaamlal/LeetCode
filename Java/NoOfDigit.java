package Java;

public class NoOfDigit {
    public static void main(String[] args) {
        
    }

    public static int digits(int nums) {
        int base=10;
        // Why this is working ?
        // It is because log tells how many time the base of that number ,run to get that perticular value
        return (int) (Math.log(nums)/Math.log(base)) +1;
    }
}
