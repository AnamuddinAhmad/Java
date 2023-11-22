import java.util.Scanner;

public class Sorted_Search_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ");
        int target = sc.nextInt();
        int Matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        staricaseSearch(Matrix, target);
        reversestaircaseSearch(Matrix, target);
        sc.close();
    }
    
    // Reverse searching.
    public static boolean reversestaircaseSearch(int[][] Matrix, int target) {
        // It will search from left m-1.
        int row = Matrix.length-1;
        int col1=0;
        int col = Matrix[Matrix.length][col1];
        while (row >= 0 && col < Matrix[0].length) {
            if (target == Matrix[row][col]) {
                System.out.println("Your element is found at (" + row + "," + col + ")");
                return true;
            } else if (target < Matrix[row][col]) {
                row--;
            } else {
                col1++;
            }
        }
        System.out.println("Key not found.");
        return false;
    }

    // 
    static boolean staricaseSearch(int[][] Matrix, int target) {
        int row = 0;
        int col = Matrix[0].length - 1;

        // It will search form n-1.
        while (row < Matrix.length && col >= 0) {
            if (target == Matrix[row][col]) {
                System.out.println("Your element is found at (" + row + "," + col + ")");
                return true;
            } else if (target < Matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found.");
        return false;
    }

}
