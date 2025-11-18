package P12;

import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom;

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = Raja26.nextLine();
            System.out.print("Masukkan Baris: ");
            baris = Raja26.nextInt();
            System.out.print("Masukkan Kolom: ");
            kolom = Raja26.nextInt();
            Raja26.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input Penonton Lainnya? (y/n): ");
            next = Raja26.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    
}
