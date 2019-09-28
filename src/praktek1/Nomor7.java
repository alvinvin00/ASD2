package praktek1;

public class Nomor7 {
    public static void main(String[] args) {
        String string = "222";
        System.out.println(findString(string, "22"));

    }


    private static int findString(String string, String find) {
        int findLength = find.length();
        if (string.length() < findLength) {
            return 0;
        } else {
            if (string.substring(0, findLength).equalsIgnoreCase(find)) {
                return 1 + findString(string.substring(findLength), find);
            } else {
                return findString(string.substring(1), find);
            }

        }


    }


}
