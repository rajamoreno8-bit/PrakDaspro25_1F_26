package P12;

import java.util.Scanner;

public class Siakad26 {
    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);
        int[][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input Nilai Mahasiswa Ke - " + (i+1));
            double totalPersiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai Mata Kuliah " + (j+1) + " : ");
                nilai[i][j] = Raja26.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai Rata - Rata : " + totalPersiswa/3);

        }
        System.out.println("\n==============================");
        System.out.println("Rata - Rata Nilai Setiap Mata Kuliah : ");

        for (int j = 0; j < 3; j++) {
            double totalPermatkul = 0;

            for (int i = 0; i < 4; i++) {
                totalPermatkul += nilai [i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPermatkul / 4);
        }
    }
}
