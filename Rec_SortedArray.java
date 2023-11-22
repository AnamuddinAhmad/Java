public class Rec_SortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 51};
        boolean bool =SortedArray(arr, 0);
        if (bool==true) {
            System.out.println("Your Arrays is Sorted.");
        }else{
            System.out.println("Your Arrays is not Sorted.");
        }
    }

    public static boolean SortedArray(int[] arr, int i) {
        
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }

        return SortedArray(arr, i+1);
    }
}
