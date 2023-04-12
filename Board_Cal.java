import java.util.Scanner;

public class Board_Cal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n"+"\t ***Enter Your Mark's Here,*** \n");
        System.out.print("Enter the Marks of Math    : ");
        byte math = sc.nextByte();
        System.out.print("Enter the Marks of Hindi   : ");
        byte hindi = sc.nextByte();
        System.out.print("Enter the Marks of English : ");
        byte english = sc.nextByte();
        System.out.print("Enter the Marks fo Science : ");
        byte scince = sc.nextByte();
        System.out.print("Enter the Marks of Urdu    : ");
        byte urdu = sc.nextByte();
        float avg = (math + hindi + english + scince + urdu) / 5f;
        System.out.print("\n"+"\t"+"Your Persentage is : " + avg);
        if (avg >= 33 && math >= 33 && hindi >= 33 && english >= 33 && scince >= 33 && urdu >= 33) {
            System.out.print("\n"+"\n \t***Congratulation PASS***\n");
        } else {
            System.out.print(" You are FAIL !");
        }
        System.out.print("\t ***YOUR MARKS***\n\n MATH     : " + math + "\n HINDI    : " + hindi + "\n ENGLISH  : "
                + english + "\n SCIENCE  : " + scince + "\n URDU     : " + urdu + "\n");
        System.out.print("Your Persentage is : " + avg);

    }

}
