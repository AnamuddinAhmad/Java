public class Rec_Increase {
    public static void main(String[] args) {
        int n = 1;
        pirntIncnum(n);
    }

    public static void pirntIncnum(int n) {

        // if its print in increasing order in decreasing manner

        // if (n < 1) {
        //     return;
        // }
        // pirntIncnum(n - 1);
        // System.out.println(n);

        // 1 method

        System.out.println(n);
        if (n < 10) {
            pirntIncnum(n + 1);
            return;
        }

        // 2 method

        // System.out.println(n);
        // if (n == 10) {
        // return;
        // }
        // pirntIncnum(n+1);

        // 3 method

        // if (n <= 10) {
        // System.out.println(n);
        // pirntIncnum(n+1);
        // return;
        // }
        // System.out.println(n);

    }
}
