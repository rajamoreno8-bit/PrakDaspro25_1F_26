package P7;

import java.util.Scanner;

public class CM_Siakad_26 {

    public static void main(String[] args) {
         Scanner Raja26 = new Scanner(System.in);
        String nama, nim;
        int Pancasila, Daspro, Bing;
        int skspancasila = 2;
        int sksdaspro = 3;
        int sksbing = 2;

        System.out.println("===== INPUT MAHASISWA =====");
        System.out.print("Nama : ");
        nama = Raja26.nextLine(); 
        System.out.print("Nim : ");
        nim = Raja26.nextLine();
        System.out.println("");

        System.out.println("Masukan Nilai Angka (0 - 100): ");
        System.out.print("Pancasila : ");
        Pancasila = Raja26.nextInt();
        System.out.print("Dasar Pemorgramman : ");
        Daspro = Raja26.nextInt();
        System.out.print("Bahasa Inggris : ");
        Bing = Raja26.nextInt();

        if (Pancasila < 0 || Pancasila > 100) {
            System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100");
        } else if(Daspro < 0 || Daspro > 100){
            System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100");
        } else if(Bing < 0 || Bing > 100){
            System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100");
        }

        String nilaiAkhirP, nilaiAkhirD, nilaiAkhirB;
        if (Pancasila > 80 && Pancasila <= 100){    
            nilaiAkhirP = "A";
        }else if(Pancasila > 73 && Pancasila <=80){
            nilaiAkhirP = "B+";
        }else if(Pancasila > 65 && Pancasila <= 73){
            nilaiAkhirP = "B";
        }else if(Pancasila > 60 && Pancasila <= 65){
            nilaiAkhirP = "C+";
        }else if(Pancasila > 50 && Pancasila <= 60){
            nilaiAkhirP = "C";
        }else if(Pancasila > 39 && Pancasila <= 50){
            nilaiAkhirP = "D";
        }else{
            nilaiAkhirP = "E";
        }

        if (Daspro > 80 && Daspro <= 100){    
            nilaiAkhirD = "A";
        }else if(Daspro > 73 && Daspro <=80){
            nilaiAkhirD = "B+";
        }else if(Daspro > 65 && Daspro <= 73){
            nilaiAkhirD = "B";
        }else if(Daspro > 60 && Daspro <= 65){
            nilaiAkhirD = "C+";
        }else if(Daspro > 50 && Daspro <= 60){
            nilaiAkhirD = "C";
        }else if(Daspro > 39 && Daspro <= 50){
            nilaiAkhirD = "D";
        }else{
            nilaiAkhirD = "E";
        }

        if (Bing > 80 && Bing <= 100){    
            nilaiAkhirB = "A";
        }else if(Bing > 73 && Bing <=80){
            nilaiAkhirB = "B+";
        }else if(Bing > 65 && Bing <= 73){
            nilaiAkhirB = "B";
        }else if(Bing > 60 && Bing <= 65){
            nilaiAkhirB = "C+";
        }else if(Bing > 50 && Bing <= 60){
            nilaiAkhirB = "C";
        }else if(Bing > 39 && Bing <= 50){
            nilaiAkhirB = "D";
        }else{
            nilaiAkhirB = "E";
        }

        double nilaiSetaraP, nilaiSetaraD, nilaiSetaraB;
        if(nilaiAkhirP.equals("A")){
            nilaiSetaraP = 4;
        }else if(nilaiAkhirP.equals("B+")){
            nilaiSetaraP = 3.5;
        }else if(nilaiAkhirP.equals("B")){
            nilaiSetaraP = 3;
        }else if(nilaiAkhirP.equals("C+")){
            nilaiSetaraP = 2.5;
        }else if(nilaiAkhirP.equals("C")){
            nilaiSetaraP = 2;
        }else if(nilaiAkhirP.equals("D")){
            nilaiSetaraP = 1;
        }else{
            nilaiSetaraP = 0;
        }

        if(nilaiAkhirD.equals("A")){
            nilaiSetaraD = 4;
        }else if(nilaiAkhirD.equals("B+")){
            nilaiSetaraD = 3.5;
        }else if(nilaiAkhirD.equals("B")){
            nilaiSetaraD = 3;
        }else if(nilaiAkhirD.equals("C+")){
            nilaiSetaraD = 2.5;
        }else if(nilaiAkhirD.equals("C")){
            nilaiSetaraD = 2;
        }else if(nilaiAkhirD.equals("D")){
            nilaiSetaraD = 1;
        }else{
            nilaiSetaraD = 0;
        }

        if(nilaiAkhirB.equals("A")){
            nilaiSetaraB = 4;
        }else if(nilaiAkhirB.equals("B+")){
            nilaiSetaraB = 3.5;
        }else if(nilaiAkhirB.equals("B")){
            nilaiSetaraB = 3;
        }else if(nilaiAkhirB.equals("C+")){
            nilaiSetaraB = 2.5;
        }else if(nilaiAkhirB.equals("C")){
            nilaiSetaraB = 2;
        }else if(nilaiAkhirB.equals("D")){
            nilaiSetaraB = 1;
        }else{
            nilaiSetaraB = 0;
        }

        System.out.println("==========================================================================");
        System.out.println("                        Hasil Konversi Nilai                              ");
        System.out.println("==========================================================================");
        System.out.println("Nama : " + nama);
        System.out.println("Nim  : " + nim);
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Mata Kuliah                SKS   Nilai   Huruf   Setara");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Pancasila                  2     " + Pancasila + "      " + nilaiAkhirP + "       " + nilaiSetaraP);
        System.out.println("Dasar Pemrograman          3     " + Daspro + "      " + nilaiAkhirD + "       " + nilaiSetaraD);
        System.out.println("Bahasa Inggris             2     " + Bing + "      " + nilaiAkhirB + "       " + nilaiSetaraB);
        System.out.println("--------------------------------------------------------------------------");

        double totalSKS = 2 + 3 + 2;
        double totalNilai = (nilaiSetaraP * skspancasila) + (nilaiSetaraD * sksdaspro) + (nilaiSetaraB * sksbing);
        double ip = totalNilai / totalSKS;
        double bobot = totalNilai;

        System.out.println("Total SKS : "+ totalSKS);
        System.out.println("Bobot : " + bobot);
        System.out.println("IP");
        System.out.println(String.format("%.2f",ip));

        String status;
        if(ip >= 2){
            status = "Lulus";
        }else{
            status = "Tidak Lulus";
        }
        System.out.println("Status Semester : " + status);
        Raja26.close();

        

    }
}