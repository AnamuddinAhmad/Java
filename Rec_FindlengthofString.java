public class Rec_FindlengthofString {
    public static void main(String[] args) {
        String str = "Anamuddin Ahmad";
  findthelengthofstring(str, 0);
    }

    public static void findthelengthofstring(String str, int i) {
        int j = 0;
        if (str.length() >= i) {
            j = +i;
           findthelengthofstring(str, i + 1);
        }
        if (j==str.length()) {
            System.out.println("This is "+j);
        }

        return;
    }
}
