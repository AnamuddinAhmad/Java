public class Strings {
    public static void main(String[] args) {
        String str="ractbar";
        boolean result=palindrome(str);
        if(result==true){
            System.out.println("This is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }

    public static boolean palindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
