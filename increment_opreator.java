import java.util.Scanner;

public class increment_opreator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\t <-----***WELCOME**----->");

            // increment your number mean if you enter 9 it's shows 10.

            System.out.print("Enter the num : ");
            int a = sc.nextInt();
            ++a;
            System.out.println("your increment number is : " + a);

            // decrement of number if we are enter 8 mean it show 7.

            System.out.print("enter the second num : ");
            byte b = sc.nextByte();
            b--;
            System.out.println("Your decrement num is : " + b);

            // increment string mean if you are enter a mean it's shows b. because of
            // increment.

            System.out.print("Enter the sting : ");
            char c = sc.next().charAt(1);
            c = (char) (c + 2);
            System.out.println("Your increment string is : " + c);

            // increment with multiplication of number mean if you are enter the 9 mean it
            // will be make 9 and its depend on you what is multiplication number.

            System.out.print("Enter the num : ");
            int g = sc.nextInt();
            ++g;
            System.out.println("your increment number is : " + g * 8);
        }

    }
}
