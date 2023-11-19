public class Rec_factorial {
    public static void main(String[] args) {
        int n=5;
        // factorial(n);
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
      if (n==0 || n==1) {
        return 1;
      }
      return n*factorial(n-1);
    }
}
