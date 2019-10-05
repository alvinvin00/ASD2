package recursive;

public class Nomor1 {


    public static void main(String[] args) {
        int n = 218189;
        System.out.println(
                "Jumlah Bilangan 9 di bilangan " + n + " = " + hitungSembilan(n, 0));
    }

    private static int hitungSembilan(int n, int j) {
        if (n <= 0) {
            return j;
        } else {
            System.out.println(n);
            if (n % 10 == 9) j++;
            return hitungSembilan(n / 10, j);
        }
    }
}
