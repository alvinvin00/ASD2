package graf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class TransversalGraf {

    public static void BFS(int[][] matrix, int simpulAwal) {
        boolean[] visited = new boolean[matrix.length];
        visited[simpulAwal - 1] = true;
        Queue<Integer> q = new LinkedList<>();

        q.add(simpulAwal);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            int x = q.remove();
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[x - 1][i] == 1 && !visited[i]) {
                    q.add(i + 1);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int jumlah, simpul, sisi;

        System.out.print("Masukkan jumlah simpul : ");
        jumlah = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah sisi : ");
        sisi = Integer.parseInt(br.readLine());

        int[][] matrix = new int[jumlah][jumlah];

        System.out.println("Sisi <Asal> <Tujuan>");

        for (int i = 0; i < sisi; i++) {
            String input = br.readLine();
            String[] split = input.split(" ");
            int asal = Integer.parseInt(split[0]);
            int tujuan = Integer.parseInt(split[1]);

            matrix[asal - 1][tujuan - 1] = 1;
            matrix[tujuan - 1][asal - 1] = 1;

        }
        System.out.print("Masukkan simpul awal : ");
        simpul = Integer.parseInt(br.readLine());

        System.out.println("Matriks ketetangaan : ");
        for (int i = 0; i <= jumlah; i++) {
            for (int j = 0; j <= jumlah; j++) {
                if (i == 0) {
                    System.out.print(j + " ");
                } else if (j == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(matrix[i - 1][j - 1] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("BFS Transversal");
        BFS(matrix, simpul);
    }
}
