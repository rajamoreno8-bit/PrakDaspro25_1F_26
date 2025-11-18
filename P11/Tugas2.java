package P11;

import java.util.Scanner;

public class Tugas2 { 
        public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);

        String[] menu = {"Kopi", "Teh", "Kentanggoreng","Roti", "Nasigoreng"};
        String namapelanggan;
        int jumlahKopi, jumlahTeh, jumlahKentangGoreng, jumlahRoti, jumlahNasiGoreng, TotalHarga;
        int HargaKopi = 15000;
        int HargaTeh = 5000;
        int HargaKentangGoreng = 15000;
        int HargaRoti = 5000;
        int HargaNasiGoreng = 20000;

        System.out.print("Masukkan nama pelanggan : ");
        namapelanggan = Raja26.nextLine();

        System.out.println("daftar menu :");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.println("item ");
        System.out.print("Jumlah Kopi : ");
        jumlahKopi = Raja26.nextInt();
        System.out.print("jumlah Teh : ");
        jumlahTeh = Raja26.nextInt();
        System.out.print("Jumlah Kentang Goreng : ");
        jumlahKentangGoreng = Raja26.nextInt();
        System.out.print("Jumlah Roti : ");
        jumlahRoti = Raja26.nextInt();
        System.out.print("Jumlah Nasi Goreng : ");
        jumlahNasiGoreng = Raja26.nextInt();

        TotalHarga = (jumlahKopi * HargaKopi) + (jumlahTeh * HargaTeh) + (jumlahKentangGoreng * HargaKentangGoreng) + (jumlahRoti * HargaRoti) + (jumlahNasiGoreng * HargaNasiGoreng);
        Raja26.nextLine();
        
        System.out.println("-------- Nota Pembelian --------");
        System.out.println("Nama Pelanggan : "+namapelanggan);
        System.out.println("--------------------------------");
        System.out.println("------------- Item -------------");

        if (jumlahKopi > 0) {
             System.out.println("Kopi : " + jumlahKopi + " x Rp " + 15000 + " = Rp " + (jumlahKopi * 15000));
        }
        if (jumlahTeh > 0) {
             System.out.println("Teh : " + jumlahTeh + " x Rp " + 5000 + " = Rp " + (jumlahTeh * 5000));
        }
        if (jumlahKentangGoreng > 0) {
             System.out.println("Kentang Goreng : " + jumlahKentangGoreng + " x Rp " + 15000 + " = Rp " + (jumlahKentangGoreng * 15000));
        }
        if (jumlahRoti > 0) {
             System.out.println("Roti : " + jumlahRoti + " x Rp " + 5000 + " = Rp " + (jumlahRoti * 5000));
        }
        if (jumlahNasiGoreng > 0) {
             System.out.println("Nasi Goreng : " + jumlahNasiGoreng + " x Rp " + 20000 + " = Rp " + (jumlahNasiGoreng * 20000));

        System.out.println("--------------------------------");
        System.out.println("Total yang harus dibayar: Rp " + TotalHarga);
        System.out.println("--------------------------------");
        }
    }
}