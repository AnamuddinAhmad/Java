// 2-D Array printing using for loop
public class practic {
    public static void main(String[] args) {
        int marks[];
        int flats[][];
        flats = new int[2][3];
        flats[0][0] = 5;
        flats[0][1] = 7;
        flats[0][2] = 8;
        flats[1][0] = 9;
        flats[1][1] = 10;
        flats[1][2] = 11;
        int sum = 0;
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {

                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");

        }
    }
}
