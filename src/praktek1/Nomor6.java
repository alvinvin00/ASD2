package praktek1;

public class Nomor6 {
    public static void main(String[] args) {
        System.out.println(pindahA("aare", 0, 0));
    }

    private static String pindahA(String string, int i, int j) {
        if (i == string.length()) {
            return string.concat("a".repeat(j));
        } else {
            if (string.charAt(i) == 'a') {

                j++;
            }

            System.out.println(string);
            return pindahA(string, ++i, j);
        }
    }

}
