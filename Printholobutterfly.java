import java.util.Scanner;

public class Printholobutterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        butterfly(a);
        sc.close();
    }

    public static void butterfly(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j || j==1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for (int j = a; j >= i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = a; j >= i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == j || j==1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i == j || j==1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for (int j = a; j >= i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = a; j >= i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == j || j==1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
