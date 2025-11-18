package P11;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);

        int BanyakJumlahMhs, NilaiTertinggi = 0, NilaiTerendah = 0; 
        double RataRata, total = 0;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        BanyakJumlahMhs = Raja26.nextInt();
        int NilaiMahasiswa [] = new int[BanyakJumlahMhs];

        for (int i = 0; i < BanyakJumlahMhs; i++) {
            System.out.print("Masukkan Nilai Nilai Mahasiswa ke- "+(i+1)+ " : ");
            NilaiMahasiswa [i] = Raja26.nextInt();            
        } 

        for (int i = 0; i < NilaiMahasiswa.length; i++) {
            total += NilaiMahasiswa [i];
        }

        RataRata = total/NilaiMahasiswa.length;
        System.out.println("Rata - rata nilai = "+RataRata);

         for (int i = 0; i < NilaiMahasiswa.length; i++) {
            total += NilaiMahasiswa[i];
            if (NilaiMahasiswa[i] > NilaiTertinggi) {
                NilaiTertinggi = NilaiMahasiswa[i];
            }else{
                if (NilaiMahasiswa[i] > NilaiTerendah) {
                    NilaiTerendah = NilaiMahasiswa [i];
                }
            } 
        }
        System.out.println("Nilai Tertinggi = "+NilaiTertinggi);
        System.out.println("Nilai Terendah = "+NilaiTerendah);
        }
    }