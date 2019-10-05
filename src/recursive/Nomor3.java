package recursive;

public class Nomor3 {
    public static void main(String[] args) {

        int[] array = {1, 2, 11, 11};
        System.out.println(cari11(array, 0, 0));

    }

    private static int cari11(int[] array, int i, int j) {
        if (i == array.length) {
            return j;
        } else {
            System.out.println(array[i]);
            if (array[i] == 11) j++;
            return cari11(array, ++i, j);

        }


    }


}
