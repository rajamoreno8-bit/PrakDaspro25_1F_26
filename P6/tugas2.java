package P6;

import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = Raja26.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }
    
}
