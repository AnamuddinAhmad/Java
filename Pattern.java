public class pattern {
    public static void main(String[] args)
     {
        int n=30;
        int x=n/2;
        int i,j;
        for(i=2;i<=n;i++)
        {
            for(j=2;j<=n;j++)
            {
                if(i==n/2||((j<=x)!= false &&j>n/2))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");

                }
            }
            System.out.println();
            if(i<=n/2)
            {
                x++;
            }
            else
            {
                x--;

            }

        }
    }
    
}
