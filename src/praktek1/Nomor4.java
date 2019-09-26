package praktek1;

public class Nomor4 {

    public static void main(String[] args) {
        System.out.println(jumlahBilangan(69, 0));


    }

    private static int jumlahBilangan(int n, int j) {
        if (n == 0) {
            return j;
        } else {
            return jumlahBilangan(n / 10, j + n % 10);
        }
    }
}
