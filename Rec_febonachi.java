public class Rec_febonachi {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonachi(n));
    }

    private static int fibonachi(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        //Two way method.
        // int fib1 = fibonachi(n - 1);
        // int fib2 = fibonachi(n - 2);
        // int fib = fib1 + fib2;

        return fibonachi(n-1)+fibonachi(n-2);
    }
}
