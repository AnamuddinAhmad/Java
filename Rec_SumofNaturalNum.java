public class Rec_SumofNaturalNum {
    public static void main(String[] args) {
        int n= 10;
        System.out.println( sumOfNaturalnum(n));
    }
    public static int sumOfNaturalnum(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfNaturalnum(n-1);
    }
}
