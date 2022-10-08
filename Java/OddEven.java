package Java;

public class OddEven {
    public static void main(String[] args) {
        boolean x=isOdd(8);
        // If odd then it will return 1
        System.out.println(x);
        
    }   
    
    public static boolean isOdd(int nums) {
        // So odd number have the last number as 1 , got my point
        return  (nums & 1)==1;
    }
}


// How this work ?
// Well how this work is that ,actully internally the machine changes the number into binnary
// There after this happen that comparision takes place 
// And as we know that ,last digit is sufficient for the comparision of element for odd/even