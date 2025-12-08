package P15;

import java.util.Scanner;

public class CM2_Siakad_26 {

    static Scanner Raja26 = new Scanner(System.in);

    static String[] mataKuliah26 = {
        "Pancasila",
        "Dasar Pemrograman",
        "Praktikum Dasar Pemrograman",
        "Bahasa Inggris 1",
        "Fisika",
        "Matematika Dasar",
        "Konsep Teknologi Informasi",
        "Keselamatan dan Kesehatan Kerja",
        "Critical Thingking Dan Problem Solving"
    };

    static int[] sks = {2,2,2,2,2,2,3,2,2};

    static int totalMahasiswa26 = 2;

    static String[] names = new String[totalMahasiswa26];
    static String[] nims = new String[totalMahasiswa26];
    static double[][] nilaiAngka26 = new double[totalMahasiswa26][mataKuliah26.length];
    static String[][] nilaiHuruf26 = new String[totalMahasiswa26][mataKuliah26.length];
    static double[][] nilaiBobot26 = new double[totalMahasiswa26][mataKuliah26.length];
    static double[] ips26 = new double[totalMahasiswa26];
    static double[] totalBobotMhs26 = new double[totalMahasiswa26];

    static int totalSKS26 = 0;

    static {
        for (int i = 0; i < sks.length; i++) {
            totalSKS26 += sks[i];
        }
    }

    static String konversiHuruf(double nilai) {
        if (nilai >= 85) return "A";
        else if (nilai >= 80) return "A-";
        else if (nilai >= 75) return "B+";
        else if (nilai >= 70) return "B";
        else if (nilai >= 65) return "B-";
        else if (nilai >= 60) return "C+";
        else if (nilai >= 55) return "C";
        else if (nilai >= 50) return "D";
        else return "E";
    }

    static double konversiBobot(String huruf) {
        return switch (huruf) {
            case "A" -> 4.0;
            case "A-" -> 3.7;
            case "B+" -> 3.3;
            case "B" -> 3.0;
            case "B-" -> 2.7;
            case "C+" -> 2.3;
            case "C" -> 2.0;
            case "D" -> 1.0;
            default -> 0.0;
        };
    }

    static void tambahMahasiswa() {

        System.out.println("\nDaftar Mahasiswa:");
        for (int i = 0; i < totalMahasiswa26; i++) {
            if (names[i] == null)
                System.out.println((i+1) + ". (belum diisi) / -");
            else
                System.out.println((i+1) + ". " + names[i] + " / " + nims[i]);
        }

        int pilihan;
        while (true) {
            System.out.print("Pilih nomor mahasiswa (1-" + totalMahasiswa26 + "): ");
            try {
                pilihan = Integer.parseInt(Raja26.nextLine());
                if (pilihan < 1 || pilihan > totalMahasiswa26) {
                    System.out.println("[ERROR] Nomor tidak valid.");
                } else break;
            } catch (Exception e) {
                System.out.println("[ERROR] Input bukan angka.");
            }
        }

        int idx = pilihan - 1;

        System.out.println("\n=== INPUT NILAI MAHASISWA ===");
        System.out.print("Nama : ");
        names[idx] = Raja26.nextLine().trim();

        System.out.print("NIM  : ");
        nims[idx] = Raja26.nextLine().trim();

        for (int i = 0; i < mataKuliah26.length; i++) {
            double val;
            while (true) {
                System.out.print("Nilai " + mataKuliah26[i] + " (0-100): ");
                try {
                    val = Double.parseDouble(Raja26.nextLine().trim());
                    if (val < 0 || val > 100)
                        System.out.println("[ERROR] Nilai harus 0 - 100");
                    else break;
                } catch (Exception e) {
                    System.out.println("[ERROR] Masukkan angka!");
                }
            }

            nilaiAngka26[idx][i] = val;
            nilaiHuruf26[idx][i] = konversiHuruf(val);
            nilaiBobot26[idx][i] = konversiBobot(nilaiHuruf26[idx][i]);
        }

        hitungIPS(idx);

        System.out.println("[SUCCESS] Data mahasiswa berhasil disimpan!");
    }

    static void hitungIPS(int idx) {
        double totalBobot26 = 0;

        for (int i = 0; i < mataKuliah26.length; i++) {
            totalBobot26 += nilaiBobot26[idx][i] * sks[i];
        }

        totalBobotMhs26[idx] = totalBobot26;
        ips26[idx] = totalBobot26 / totalSKS26;
    }

    static String statusSemester(int idx) {

        if (ips26[idx] < 2.00)
            return "TIDAK LULUS SEMESTER";

        for (int i = 0; i < mataKuliah26.length; i++) {
            if (nilaiHuruf26[idx][i].equals("E"))
                return "TIDAK LULUS SEMESTER";
        }

        if (nilaiHuruf26[idx][0].equals("D") || nilaiHuruf26[idx][0].equals("E"))
            return "TIDAK LULUS SEMESTER";

        return "LULUS SEMESTER";
    }

    static void lihatKHS() {
        System.out.print("Masukkan NIM mahasiswa: ");
        String cariNim = Raja26.nextLine().trim();

        int idx = -1;
        for (int i = 0; i < totalMahasiswa26; i++) {
            if (nims[i] != null && nims[i].equals(cariNim)) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            System.out.println("[ERROR] Data mahasiswa tidak ditemukan.");
            return;
        }

        System.out.println("==============================================================================");
        System.out.println("                        HASIL KONVERSI NILAI MAHASISWA                        ");
        System.out.println("==============================================================================");
        System.out.println("Nama : " + names[idx]);
        System.out.println("NIM  : " + nims[idx]);
        System.out.println("------------------------------------------------------------------------------");
        System.out.printf("%-3s %-45s %-5s %-7s %-7s %-7s\n",
                "No", "Mata Kuliah", "SKS", "Nilai", "Huruf", "Setara");
        System.out.println("------------------------------------------------------------------------------");

        for (int i = 0; i < mataKuliah26.length; i++) {
            System.out.printf("%-3d %-45s %-5d %-7.0f %-7s %-7.1f\n",
                    (i + 1),
                    mataKuliah26[i],
                    sks[i],
                    nilaiAngka26[idx][i],
                    nilaiHuruf26[idx][i],
                    nilaiBobot26[idx][i]
            );
        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.printf("Total Bobot : %.2f\n", totalBobotMhs26[idx]);
        System.out.printf("Total SKS   : %d\n", totalSKS26); 
        System.out.printf("IPS         : %.2f\n", ips26[idx]);
        System.out.printf("Status      : %s\n", statusSemester(idx));
        System.out.println("==============================================================================\n");
    }

    static void Menu() {
        int pilihan;

        do {
            System.out.println("\n========================================");
            System.out.println("       SISTEM SIAKAD SEDERHANA (MENU)  ");
            System.out.println("========================================");
            System.out.println("1. Input nilai mata kuliah");
            System.out.println("2. Lihat KHS (konversi & IP)");
            System.out.println("3. Keluar");
            System.out.println("========================================");
            System.out.print("Pilih menu (1-3): ");

            pilihan = Raja26.nextInt();
            Raja26.nextLine();

            switch (pilihan) {
                case 1 -> tambahMahasiswa();
                case 2 -> lihatKHS();
                case 3 -> System.out.println("Keluar...");
                default -> System.out.println("[ERROR] Menu tidak valid.");
            }

        } while (pilihan != 3);
    }

    public static void main(String[] args) {
        Menu();
    }
}
