package recursive;

public class Nomor6 {
    public static void main(String[] args) {
        System.out.println(charToLast("aahiaa", 'a'));
    }

    private static String charToLast(String string, char ch) {
        if (string.length() <= 0) {
            return "";
        }

        String newString = string.substring(1);

        if (string.indexOf(ch) == 0) {
            return charToLast(newString, ch) + ch;
        } else {
            return string.charAt(0) + charToLast(newString, ch);
        }
    }

}
