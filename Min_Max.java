public class practic {
    public static void main(String[] args) {
        //Initlizing array
        int num[] = {55, 235, 200, 30, 400, 500, 66,456 ,342};
        int max = Integer.MIN_VALUE;
        for (int e : num) {
            if (e > max) {
                max = e;
            }
        }
        int min =Integer.MAX_VALUE;
        for (int f : num) {
            if (f < min) {
                min = f;
            }
        }
        System.out.println("The maximum valu of array : " + max);
        System.out.println("The minimum value of array : " + min);
        //Range of Maximum And Minimum element of array .. 
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

    }
}
