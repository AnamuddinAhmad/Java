public class Rec_Optimize_power {
    public static void main(String[] args) {
        int num = 2;
        int pow = 5;
        System.out.println(Optimize_power(num, pow));
    }

    public static int Optimize_power(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        int power = Optimize_power(num, pow / 2);
        int powersq = power * power;
        if (pow%2 != 0) {
            powersq= num * powersq;
        }
        return powersq;
    }
}
