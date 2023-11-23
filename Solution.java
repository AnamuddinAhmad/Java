import java.util.Scanner;
import java.util.regex.*;

public class Solution
{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num of string you want to enter : ");
        int num = sc.nextInt();

        for(int i=0; i<num; i++) {
            String s = sc.next();
            try {
                Pattern.compile(s);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        sc.close();
        
    }
}
