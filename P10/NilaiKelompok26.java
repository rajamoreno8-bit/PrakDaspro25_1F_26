package P10;

import java.util.Scanner;

public class NilaiKelompok26 {
    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);

        int i=1, j=1, nilai, totalnilai=0;
        double rataratanilai=0;
            while (i <= 6) {
                System.out.println("Kelompok " + i);
                totalnilai = 0;
                for (j = 1; j<= 5; j++) {
                    System.out.print("Nilai dari kelompok peneliti " + j + ": ");
                    nilai = Raja26.nextInt();
                    totalnilai += nilai;
                 }
                 rataratanilai = totalnilai / 5.0;
                 System.out.println("Rata-rata nilai kelompok " + i + " = " + rataratanilai);
                    i++;
            }
    }
}