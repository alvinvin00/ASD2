package recursive;

public class Nomor3 {
    public static void main(String[] args) {

        int[] array = {1, 2, 11, 11};
        System.out.println(cari11(array, 0));

    }

    private static int cari11(int[] array, int i) {
        if (i == array.length) {
            return 0;
        } else if (array[i] == 11) {
            return 1 + cari11(array, ++i);
        } else {
            return cari11(array, ++i);
        }


    }


}
