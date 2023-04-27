/*
 * Program for searching arrays
 * to find element is present in array or not
 */

public class practic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 34, 54, 44, 23, 59, 36, 53, 2, 32 };
        System.out.print("Search : ");
        int a = sc.nextInt();
        boolean IsInArray = false;
        for (int element : arr) {
            if (a == element) {
                IsInArray = true;
                break;
                // System.out.println();
            }
        }
        if (IsInArray) {
            System.out.println("Element is Present in Array");
        } else {
            System.out.println("Element is not present in Array");
        }
    }
}
