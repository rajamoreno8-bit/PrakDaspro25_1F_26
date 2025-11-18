package P12;

import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom, menu;

        while (true) {
            System.out.print("Pilih Menu : \n 1. Input Data Penonton \n 2. Tampilkan DAftar Penonton \n 3. Exit \n Masukkan Menu: ");
            menu = Raja26.nextInt();
            Raja26.nextLine();

            if (menu == 1) {
                System.out.println("Input Data Penonton");
                for (int i= 0; i< penonton.length; i++) {
                    System.out.print("Masukkan Nama: ");
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
            } else if (menu == 2) {
                System.out.println("Tampilkan Daftar Penonton: ");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.print(penonton[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                break; 
            }
        }

        
    }
    
}
