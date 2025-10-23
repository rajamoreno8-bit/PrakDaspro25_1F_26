package P9;

import java.util.Scanner;

public class KafeDoWhile26 {
    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);

        int teh, kopi, roti, totalharga;
        int hargateh = 7000;
        int hargakopi = 12000;
        int hargaroti = 20000;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = Raja26.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = Raja26.nextInt();

            System.out.print("Jumlah teh: ");
            teh = Raja26.nextInt();

            System.out.print("Jumlah roti: ");
            roti = Raja26.nextInt();

            totalharga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
            System.out.println("Total yang harus dibayar: Rp " + totalharga);

            Raja26.nextLine();

        } while (true);

        System.out.println("Semua transaksi selesai.");
        Raja26.close();
    }
}
