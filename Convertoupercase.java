public class Convertoupercase {
    public static void main(String[] args) {
        String str = "hello mahi i love you";
        System.out.println(toupercser(str));
    }

    public static String toupercser(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        for (int i = 1; i < sb.length()-1; i++) {
            if (sb.charAt(i) ==' '){
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }
}
