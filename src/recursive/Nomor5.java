package recursive;

public class Nomor5 {

    public static void main(String[] args) {

        System.out.println(cariX("xxhiixx", 0));
    }

    private static int cariX(String string, int i) {

        if (i == string.length()) {
            return 0;
        } else if (string.charAt(i) == 'x') {
            return 1 + cariX(string, ++i);
        } else {
            return cariX(string, ++i);
        }

    }
}
