import java.util.Scanner;
public class table 
{
    public static void main(String[] args)
    {
        System.out.println("i am main class ");
        table1(0);
    }
    //This code is writen in the concept of object and class
    public static void table1(int i)
    {
        System.out.print("Enter the first number : ");
        try (Scanner sc = new Scanner(System.in))
         {
            int a = sc.nextInt();
            for( i=1;i<=10;i++)
            {
                System.out.println(a +" * " + i + " = " +a*i);  
            }
        }
    }
}
// //for decreasing printing table
System.out.println("//From here decreasing table printing //");
for(int i=10;i>=1;i--)
{
System.out.printf("%d X %d = %d \n",a,i,a*i);

}
