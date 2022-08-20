package Java;

class MinimumCost {
    public static int main(String[] args) {

        int[] position = new int[30]; // This number first, this is remove
        int evenCount = 0;
        int oddCount = 0;
        for (int i : position) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (evenCount > oddCount) {
            return oddCount;
        } else {
            return evenCount;
        }

    }
}