package praktek1;

public class Nomor7 {
    public static void main(String[] args) {
        String string = "22abc22";
        System.out.println(findString(string, "22"));

    }


    private static int findString(String string, String find) {
        int findLength = find.length();
        if (string.length() == findLength) {
            return 0;
        } else {
            String newString = string.substring(findLength-1);
            if (string.substring(0, findLength).equalsIgnoreCase(find)) {
                return 1 + findString(newString, find);
            } else {
                return findString(newString, find);
            }

        }


    }


}
