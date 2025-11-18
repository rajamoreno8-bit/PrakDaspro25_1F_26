package P10;

import java.util.Scanner;

public class blabla {
    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);

        int i = 1, j, nilai, totalnilai;
        double rataratanilai;

        double ratarataTertinggi = 0;
        int kelompokTertinggi = 0;

        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalnilai = 0;

            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai dari penilai ke-" + j + ": ");
                nilai = Raja26.nextInt();
                totalnilai += nilai;
            }

            rataratanilai = totalnilai / 5.0;
            System.out.println("Rata-rata nilai kelompok " + i + " = " + rataratanilai);

            if (rataratanilai > ratarataTertinggi) {
                ratarataTertinggi = rataratanilai;
                kelompokTertinggi = i;
            }

            i++;
            System.out.println();
        }

        System.out.println("=======================================");
        System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok " + kelompokTertinggi);
        System.out.println("Dengan rata-rata nilai = " + ratarataTertinggi);
        System.out.println("=======================================");
    }
}
