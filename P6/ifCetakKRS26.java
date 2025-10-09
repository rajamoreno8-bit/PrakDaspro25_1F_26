package P6;

import java.util.Scanner;

public class ifCetakKRS26 {
    
    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false) :");
        boolean uktLunas = Raja26.nextBoolean();

        System.out.println("Pembayaran UKT terverivikasi");
        System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
    }

}