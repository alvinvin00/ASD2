package recursive;

public class Nomor4 {

    public static void main(String[] args) {
        System.out.println(jumlahBilangan(69));


    }

    private static int jumlahBilangan(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + jumlahBilangan(n / 10);
        }
    }
}
