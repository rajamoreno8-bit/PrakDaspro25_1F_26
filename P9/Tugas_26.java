package P9;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Tugas_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));

        int jumlahTiket, hargaTiket = 50000, totalTiket = 0;
        double hargaDasar, diskon, totalBayar, totalPendapatan = 0;
        String lanjut;

        do {
            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = input.nextInt();

            if (jumlahTiket <= 0) {
                System.out.println("Jumlah tiket harus lebih dari 0. Coba lagi.\n");
                continue;
            }

            hargaDasar = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            totalBayar = hargaDasar - (hargaDasar * diskon);
            totalTiket += jumlahTiket;
            totalPendapatan += totalBayar;

            System.out.println("------------------------------------");
            System.out.println("Harga Dasar   : Rp " + nf.format(hargaDasar));
            System.out.println("Diskon        : " + (int)(diskon * 100) + "%");
            System.out.println("Total Bayar   : Rp " + nf.format(totalBayar));
            System.out.println("------------------------------------\n");

            System.out.print("Apakah ada pelanggan lain? (Y/N): ");
            lanjut = input.next();
            System.out.println();

        } while (lanjut.equalsIgnoreCase("Y"));

        System.out.println("====================================");
        System.out.println("Total Tiket Terjual   : " + totalTiket);
        System.out.println("Total Pendapatan Hari : Rp " + nf.format(totalPendapatan));
        System.out.println("====================================");

        input.close();
    }
}
