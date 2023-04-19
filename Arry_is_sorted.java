public class practic {
    public static void main(String[] args) {
        boolean IsSorted = true;
      //Given arrays
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                IsSorted = false;
                break; 
            }
        }
      //Condition
      //This is the code of array is sorted or not ?
        if (IsSorted) {
            System.out.println("Array is sorted ");
        } else {
            System.out.println("Array is not sorted ");
        }
    }
}
