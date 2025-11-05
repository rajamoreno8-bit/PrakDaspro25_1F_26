package P10;

import java.util.Scanner;

public class P10tugas3 {
    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);

        int jumlahCabang, totalPelanggan = 0, totalItem = 0;

        System.out.print("Jumlah cabang kafe: ");
        jumlahCabang = Raja26.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = Raja26.nextInt();
            int totalItemCabang = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = Raja26.nextInt();
                totalItemCabang += item;
            }
            System.out.println("Cabang " + i + " :");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang + " item");

            totalPelanggan += jumlahPelanggan;
            totalItem += totalItemCabang;
        }

        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItem + " item");

        
    }
}