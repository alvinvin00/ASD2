package recursive;

public class Nomor2 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(hitungAngsa(n));
    }


    private static int hitungAngsa(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 2 + hitungAngsa(n - 1);
        }

    }


}
