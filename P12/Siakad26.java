package P12;

import java.util.Scanner;

public class Siakad26 {
    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);
        int jmlMahasiswa, jmlMatkul;
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        jmlMahasiswa = Raja26.nextInt();
        System.out.print("Masukkan Jumlah Mata kuliah : ");
        jmlMatkul = Raja26.nextInt();
        int[][] nilai = new int[jmlMahasiswa][jmlMatkul];

        for (int i = 0; i < nilai[i].length; i++) {
            System.out.println("Input Nilai Mahasiswa Ke - " + (i+1));
            double totalPersiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai Mata Kuliah " + (j+1) + " : ");
                nilai[i][j] = Raja26.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai Rata - Rata : " + totalPersiswa / jmlMatkul);
        }
        System.out.println("\n====================================");
        System.out.println("Rata - Rata Nilai Setiap Mata Kuliah : ");

        for (int j = 0; j < jmlMatkul; j++) {
            double totalPermatkul = 0;

            for (int i = 0; i < jmlMahasiswa; i++) {
                totalPermatkul += nilai [i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPermatkul / jmlMahasiswa);
        }
    }
}
