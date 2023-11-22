public class Rec_Lastoccurence {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 6, 8, 3, 3,8,6,7,9};
        System.out.println("Mine "+lastOccurence(arr, 3, arr.length - 1));
        System.out.println("Apna College : " + lastOccurence1(arr, 3, 0));
    }

    public static int lastOccurence1(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int lastoccur = lastOccurence1(arr, key, i + 1);
        System.out.println(lastoccur);
        if (lastoccur == -1 && arr[i] == key) {
            System.out.println("This is i "+i);
            return i;
        }
        return lastoccur;

    }

    // Its mine
    public static int lastOccurence(int[] arr, int key, int i) {
        if (i == 0) {
            return 1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lastOccurence(arr, key, i - 1);
    }
}
