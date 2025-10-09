package P6;

import java.util.Scanner;

public class ifCetakKRS26 {

    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false) : ");
        boolean uktLunas = Raja26.nextBoolean();

        // Struktur if-else
        if (uktLunas == true) {
            System.out.println("Pembayaran UKT terverifikasi.");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA.");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
        }

        Raja26.close(); // menutup scanner agar tidak ada memory leak
    }
}