package P11;

import java.util.Scanner;

public class ArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);

        int [ ] nilaiMhs = new int[10];
        int mhsLulus = 0;
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = Raja26.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs [i] > 70) {
                mhsLulus++;
            }
        }

        rata2 = total/nilaiMhs.length;
        System.out.println("Rata - rata nilai = "+rata2);
        System.out.println("BAnyak Mahasiswa Lulus Yaitu : " + mhsLulus + "orang");
    }
}