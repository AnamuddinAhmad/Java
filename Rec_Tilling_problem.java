public class Rec_Tilling_problem {
    public static void main(String[] args) {
        System.out.println("The number of way's " + tilling_Place(5));
    }

    public static int tilling_Place(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        int vertical = tilling_Place(n - 1);
        System.out.println(vertical);
        int horizontal = tilling_Place(n - 2);
        System.out.println(horizontal);
        return vertical + horizontal;
    }
}
