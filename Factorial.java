public class factorial {
    public static void main(String[] args) {
        int num = 5,a,b,c;
        a=0;b=1;
        System.out.println(a);
        for (int i = 1; i<5; i++) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
