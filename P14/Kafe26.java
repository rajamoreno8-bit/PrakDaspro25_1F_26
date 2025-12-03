

import java.util.Scanner;

public class Kafe26 {

    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);

        Menu("Andi", true, "DISKON 50%");

        System.out.print("\nMasukkan Nomor Menu Yang Ingin Anda Pesan: ");
        int pilihanMenu = Raja26.nextInt();

        System.out.print("Masukkan Jumlah Item Yang Ingin Di Pesan: ");
        int banyakItem =Raja26.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);

        System.out.println("Total Harga Untuk Pesanan Anda: Rp " + totalHarga);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang , " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda Adalah Member, Dapatkan Diskon 10% Untuk Setiap Pembelian");
        }

        if (kodePromo.equals("DISKON 50%")) {
            System.out.println("Selamat Anda Mendapatkan Diskon 50%");
        } else if (kodePromo.equals("DISKON 30%")) {
            System.out.println("Selamat Anda Mendapatkan Diskon 30%");
        } else {
            System.out.println("Kode Promo Invalid");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam  - Rp 15,000");
        System.out.println("2. Cappucino   - Rp 20,000");
        System.out.println("3. Latte       - Rp 22,000");
        System.out.println("4. Teh Tarik   - Rp 12,000");
        System.out.println("5. Roti Bakar  - Rp 10,000");
        System.out.println("6. Mie Goreng  - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan Pilih Menu Yang Anda Inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
}
