//Code of additon of matrix
public class practic{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int mat1[][]={{1,2,3},
{4,5,6}};
int mat2[][]={{7,8,9},
{7,6,5}};
int result[][]={{0,0,0},
{0,0,0}};
for(int i=0;i<mat1.length;i++)
{
for(int j=0;j<mat1[i].length;j++)
{
// System.out.printf("set value for i=%d and j=%d \n",i,j);
result[i][j]=mat1[i][j]+mat2[i][j];
//Using one for loop for printing and adding matrix !
System.out.print(result[i][j]+" ");
}
System.out.print("\n");
}
for(int i=0;i<mat1.length;i++)
{
for(int j=0;j<mat1[i].length;j++)
{
System.out.print(result[i][j] + " ");
result[i][j]=mat1[i][j]+mat2[i][j];
}
System.out.println("\n");
}
}
}
