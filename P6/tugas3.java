package P6;

import java.util.Scanner;

public class tugas3 {
    
    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);

        System.out.print("Masukkan jenis user (dosen/mahasiswa): ");
        String user = Raja26.nextLine();

        if (user.equals("dosen")) {

            System.out.println("Akses wifi diberikan (dosen)");
        } else if (user.equals("mahasiswa")) {

            System.out.print("Masukkan jumlah sks yang diambil");
            int sks = Raja26.nextInt();
            if (sks >= 12) {
                System.out.println("Akses wifi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {

            System.out.println("Akses ditolak");
        }

        Raja26.close();

    }
}
