public class Rec_Duplicate_string {
    public static void main(String[] args) {
        String str = "apnaaaacolleege";

        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }

    public static void removeDuplicate(String str, int index, StringBuilder newsb, boolean[] map) {
        if (index == str.length()) {
            System.out.println(newsb);
            return;
        }
        char curch = str.charAt(index);
        if (map[curch - 'a'] == true) {
            removeDuplicate(str, index + 1, newsb, map);
        } else {
            map[curch - 'a'] = true;
            removeDuplicate(str, index + 1, newsb.append(curch), map);
        }
    }
}
