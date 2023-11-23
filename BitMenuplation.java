/**
 * try
 */
public class BitMenuplation {
    // static void checkbitwiseevenoridd(int n){
    // int bitmask=1;
    // if((n & bitmask) == 0){
    // System.out.println("its even");
    // }else{
    // System.out.println("Odd");
    // }
    // }
    static int getshif(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setbit(int num, int pos) {
        int bitmask = 1 << pos;
        // System.out.println(1 << 3);
        return num | bitmask;
    }

    public static int clearithbit(int num, int pos) {
        int bitmask = ~(1 << pos);
        return num & bitmask;
    }

    public static int updatebit(int num, int pos, int newbit) {
        // if (newbit==0) {
        // return clearithbit(num, pos);
        // }else{
        // return setbit(num, pos);
        // }

        num = clearithbit(num, pos);
        int bitmask = newbit << pos;
        return num | bitmask;

    }

    public static int setibit(int num, int pos) {
        int bitmask = (~0) << pos;
        return num & bitmask;

    }

    static int clearbitsinrange(int num, int fpos, int lpos) {
        int a = ((~0) << (lpos));
        int b = (1 << fpos) - 1;
        int bitmask = a | b;
        return num & bitmask;
    }

    static boolean twopower(int num) {
        return (num & (num - 1)) == 0;
    }

    static int countsetbit(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) != 0) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static int fastexponient(int num, int pow) {
        int ans = 1;
        int step=0;
        while (num > 0) {
            step++;
            if ((num & 1) != 0) {
                ans = ans * pow;
            }
            pow = pow * pow;
            num = num >> 1; // it will itrate on each bits.
            System.out.println("how many times : "+step);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastexponient(10,5));
        System.out.println(twopower(21));
        System.out.println(setibit(15, 2));
        System.out.println(updatebit(10, 1, 2));
        System.out.println(clearithbit(10, 1));
        System.out.println(setbit(10, 3));
        System.out.println(getshif(10, 2));
        System.out.println(getshif(10, 2));
        // checkbitwiseevenoridd(5);
        // checkbitwiseevenoridd(7);
        // checkbitwiseevenoridd(12);
        // checkbitwiseevenoridd(4);
        // Integer a=10;
        // String str="";
        // str=Integer.toString(a);
        // System.err.println(5<<2);
        // System.err.println(~5);
        // System.err.println(~0);
        // System.err.println(5^6);
        // System.err.println(5|6);
        // System.err.println(5&6);
        // System.err.println(str);
        // System.err.println("Hello");
    }
}