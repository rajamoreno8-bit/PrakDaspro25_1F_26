package P11;

import java.util.Scanner;

public class ArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);
        System.out.println("masukkan Jumlah mahasiswa : ");
        int jmlMhs = Raja26.nextInt();
        int [ ] nilaiMhs = new int[10];
        int mhsLulus = 0, mhsTidakLulus = 0;
        double total = 0, totalLulus = 0, TotalTidakLulus = 0;
        double rata2, rata2Lulus = 0, rata2TidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = Raja26.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs [i] > 70) {
                mhsLulus++;
            }
            if (nilaiMhs [i] <= 70) {
                TotalTidakLulus += nilaiMhs[i];
                mhsTidakLulus++;
            }
        }
        rata2 = total/nilaiMhs.length;
        rata2Lulus = totalLulus / mhsLulus;
        rata2TidakLulus = TotalTidakLulus / mhsTidakLulus;
        System.out.println("Rata - Rata Nilai Lulus : " + rata2Lulus);
        System.out.println("Rata - Rata Nilai Tidak Lulus : " + rata2TidakLulus);
    }
}