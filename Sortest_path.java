import java.util.*;
public class Sortest_path {
    public static void main(String[] args) {
        String direction = "wneenesennn";
        cordinateCalculate(direction);
        String s11="Mahi";
        String s22="Mahi";
        String s33=new String("Mahi");
        if (s11==s22) {
            System.out.println("Both are equal");
        }else{
            System.out.println("Not equal");
        }
        // becase it will chake at only object level.
        if (s11==s33) {
            System.out.println("Both are equal"); 
        }else{
            System.out.println("Not equal");
        }
        // but for the chek acutal value base we use .equal function
        // and it will return ture.
        if (s11.equals(s33)) {
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }
    }

    public static void cordinateCalculate(String direction) {
        int x = 0;
        int y = 0;
        char e = 'e';
        char w = 'w';
        char n = 'n';
        char s = 's';

        for (int i = 0; i < direction.length(); i++) {
            if (direction.charAt(i) == w) {
                x += -1;
            } else if (direction.charAt(i) == e) {
                x += +1;
            } else if (direction.charAt(i) == n) {
                y += +1;
            } else if (direction.charAt(i) == s) {
                y += -1;
            }
        }
        System.out.println(x + "," + y);
        int sumofxpowypow = (int) Math.pow(x, 2) + (int) Math.pow(y, 2);
        System.out.println("Sortest path is "+(int) Math.sqrt(sumofxpowypow)+" for you destination ("+direction+")");
    }

}
