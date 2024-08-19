public class TwoD_DigoanlSum {
    public static void main(String[] args) {
        int[][] twoD = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 } 
        };

        digonalSum(twoD);
        basicApproch(twoD);
        bestApproch(twoD);

    }

    public static void digonalSum(int mat[][]) {
        int len = mat.length - 1;
        int digonal = 0;
        int i = 0;
        // RightMost Digonal
        System.out.println("RightMost Digonal");
        while (i <= len) {
            digonal += mat[len][len];
            len--;
        }
        System.out.println("Right Most "+digonal);

        digonal = 0;
        len = mat.length - 1;
        // Left Most Digonal
        System.out.println("Left Most Digonal " + len);
        while (i < mat.length && len >= 0) {
            digonal += mat[i][len];            
            i++;
            len--;
        }
        System.out.println("Left Most "+digonal);
    }

    public static void basicApproch(int mat[][]){

        int sum =0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(i==j){
                    sum+=mat[i][j];
                }
            }
        }
        System.out.println("Basic Approch "+sum);
    }

    public static void bestApproch(int mat[][]){
        int Rsum =0;
        int Lsum =0;
        for (int i = 0; i < mat.length; i++) {
            Rsum+=mat[i][i];
            if(i != mat.length-1-i)
            Lsum+=mat[i][mat.length-1-i];
        }

        System.out.println(Rsum);
        System.out.println(Lsum);
    }
}
