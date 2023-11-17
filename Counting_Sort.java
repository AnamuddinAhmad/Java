import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
      // Given array.
        int[] arr = { 0, 0, 1, 1, 2, 2, 1, 1, 0, 0, 0, 2, 2, 2, 5, 5 };
        Arrays.sort(arr);
        counting_sort(arr);
    }

    public static void counting_sort(int[] arr) {
        int largest=Integer.MIN_VALUE;
        // Find the largest value for the arr length.
        for(int i=0;i<arr.length;i++){
            // You have to give one min value and one compareing value.
            largest=Math.max(largest, arr[i]);
        }
        // Array creation based on the finding length.
        int arr1[]=new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            // At index frequency update.
            arr1[arr[i]]++;
        }
        int frequency=0;
        for (int i = 0; i < arr1.length; i++) {
            // Here arr1[0] its give the element.
            while (arr1[i]>0) {
                arr[frequency]=i;   // Here element value decrement.
                arr1[i]--;
                frequency++;   // index ++; of arr
            }
        }
        System.out.println(Arrays.toString(arr));

        
    }
}


