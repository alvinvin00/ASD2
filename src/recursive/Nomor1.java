package recursive;

public class Nomor1 {


    public static void main(String[] args) {
        int n = 91791289;
        System.out.println(
                "Jumlah Bilangan 9 di bilangan " + n + " = " + hitungSembilan(n));
    }

    private static int hitungSembilan(int n) {
        if (n <= 0) {
            return 0;
        } else if (n % 10 == 9) {
            return 1 + hitungSembilan(n / 10);
        } else {
            return hitungSembilan(n / 10);
        }
    }
}
