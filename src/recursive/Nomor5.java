package recursive;

public class Nomor5 {

    public static void main(String[] args) {

        System.out.println(cariX("xxhiixx", 0, 0));
    }

    private static int cariX(String string, int i, int j) {

        if (i == string.length()) {
            return j;
        } else {
            if (string.charAt(i) == 'x') j++;
            return cariX(string, ++i, j);
        }


    }
}
