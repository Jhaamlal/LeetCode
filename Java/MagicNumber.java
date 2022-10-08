package Java;
// Amazon question
public class MagicNumber {

    public static void main(String[] args) {
        int nums=3;
        int x=findNumber(nums);
        System.out.println(x);
        
    }
    
    public static int findNumber(int nums) {
        // While number is not zero
        // get the last bit
        // Then do right sift
        // and then give the power of five to each element and add that element into that perticular element
        // This is how things works Beta
        // 1/0*5^0 +1/0*5^1 +1/0 *5^2

        int base=5;
        int ans=0;
        while (nums >0) {
            int last=nums&1; //This will produce the last bit of a binnary number 
            nums=nums >>1;  //This will do the right shift for the element and to make the 
            ans +=base*last;   //Basic math of adding element as when needed
            base=base*5;   
        }
        return ans;
    }
}
