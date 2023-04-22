// Revers an array using revers technique..?
public class practic {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6 };
        int l = num.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        //Reverse
        for (int i = 0; i < n; i++) {
            temp = num[i];
            num[i] = num[l - i - 1];
            num[l - i - 1] = temp;
        }
        for (int element : num) {
            System.out.println(element);
        }
    }
}
