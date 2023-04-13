import java.util.Scanner;

public class fibodemo {
   //Fibonachi serise mean the sum of the previous number...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Initlize the value of veriable
        int n1=0,n2=1,n3,i,count;
        System.out.print("Enter the number : ");
        count =sc.nextInt();
        //Using for loop...
        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.println("Fibonachi number is :"+n3);
            n1=n2;
            n2=n3; 
        }
    }
}
