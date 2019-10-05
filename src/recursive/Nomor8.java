package recursive;

public class Nomor8 {

    public static void main(String[] args) {
        String str = "zazb";
        System.out.println(removeChar(str, 'z'));
    }

    private static String removeChar(String str, char ch) {
        if (str.length()==0) {
            return "";
        } else {
            char checkedChar = str.charAt(0);
            if (checkedChar == ch) {
                return removeChar(str.substring(1), ch);
            } else {
                return checkedChar + removeChar(str.substring(1), ch);
            }
        }
    }

}
