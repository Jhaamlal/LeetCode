package Java;

public class FinduniqueXOR {
    public static void main(String[] args) {
        int [] arr={2,4,6,3,1,1,4,3,2};
        int x=uniqueItem(arr);
        System.out.println(x);

        
    }

    public static int uniqueItem(int[] arr) {
        int unique=0;
        for (int i : arr) {
            unique ^=i;
        }
        return unique;
    }
}


// How this is working
// As we know there is XOR which give zero as it itntract with 
// it just like finding the plus minus of the element
// There must be the things to make the changing