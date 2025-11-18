package P7;

import java.util.Scanner;

public class CM_Siakad_26 {

    public static void main(String[] args) {
        
        Scanner Raja26 = new Scanner(System.in);
        
         String nama, nim;
        int Pancasila26, Daspro26, Bing26;
        int skspancasila26 = 2;
        int sksdaspro26 = 3;
        int sksbing26 = 2;

        System.out.println("===== INPUT MAHASISWA =====");
        System.out.print("Nama : ");
        nama = Raja26.nextLine(); 
        System.out.print("Nim : ");
        nim = Raja26.nextLine();
        System.out.println("");

        System.out.println("Masukan Nilai Angka (0 - 100): ");
        System.out.print("Pancasila : ");
        Pancasila26 = Raja26.nextInt();
        System.out.print("Dasar Pemorgramman : ");
        Daspro26 = Raja26.nextInt();
        System.out.print("Bahasa Inggris : ");
        Bing26 = Raja26.nextInt();

        if (Pancasila26 < 0 || Pancasila26 > 100) {
            System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100");
        } else if(Daspro26 < 0 || Daspro26 > 100){
            System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100");
        } else if(Bing26 < 0 || Bing26 > 100){
            System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100");
        }

        String nilaiAkhirP26, nilaiAkhirD26, nilaiAkhirB26;
        if (Pancasila26 > 80 && Pancasila26 <= 100){    
            nilaiAkhirP26 = "A";
        }else if(Pancasila26 > 73 && Pancasila26 <=80){
            nilaiAkhirP26 = "B+";
        }else if(Pancasila26 > 65 && Pancasila26 <= 73){
            nilaiAkhirP26 = "B";
        }else if(Pancasila26 > 60 && Pancasila26 <= 65){
            nilaiAkhirP26 = "C+";
        }else if(Pancasila26 > 50 && Pancasila26 <= 60){
            nilaiAkhirP26 = "C";
        }else if(Pancasila26 > 39 && Pancasila26 <= 50){
            nilaiAkhirP26 = "D";
        }else{
            nilaiAkhirP26 = "E";
        }

        if (Daspro26 > 80 && Daspro26 <= 100){    
            nilaiAkhirD26 = "A";
        }else if(Daspro26 > 73 && Daspro26 <=80){
            nilaiAkhirD26 = "B+";
        }else if(Daspro26 > 65 && Daspro26 <= 73){
            nilaiAkhirD26 = "B";
        }else if(Daspro26 > 60 && Daspro26 <= 65){
            nilaiAkhirD26 = "C+";
        }else if(Daspro26 > 50 && Daspro26 <= 60){
            nilaiAkhirD26 = "C";
        }else if(Daspro26 > 39 && Daspro26 <= 50){
            nilaiAkhirD26 = "D";
        }else{
            nilaiAkhirD26 = "E";
        }

        if (Bing26 > 80 && Bing26 <= 100){    
            nilaiAkhirB26 = "A";
        }else if(Bing26 > 73 && Bing26 <=80){
            nilaiAkhirB26 = "B+";
        }else if(Bing26 > 65 && Bing26 <= 73){
            nilaiAkhirB26 = "B";
        }else if(Bing26 > 60 && Bing26 <= 65){
            nilaiAkhirB26 = "C+";
        }else if(Bing26 > 50 && Bing26 <= 60){
            nilaiAkhirB26 = "C";
        }else if(Bing26 > 39 && Bing26 <= 50){
            nilaiAkhirB26 = "D";
        }else{
            nilaiAkhirB26 = "E";
        }

        double nilaiSetaraP26, nilaiSetaraD26, nilaiSetaraB26;
        if(nilaiAkhirP26.equals("A")){
            nilaiSetaraP26 = 4;
        }else if(nilaiAkhirP26.equals("B+")){
            nilaiSetaraP26 = 3.5;
        }else if(nilaiAkhirP26.equals("B")){
            nilaiSetaraP26 = 3;
        }else if(nilaiAkhirP26.equals("C+")){
            nilaiSetaraP26 = 2.5;
        }else if(nilaiAkhirP26.equals("C")){
            nilaiSetaraP26 = 2;
        }else if(nilaiAkhirP26.equals("D")){
            nilaiSetaraP26 = 1;
        }else{
            nilaiSetaraP26 = 0;
        }

        if(nilaiAkhirD26.equals("A")){
            nilaiSetaraD26 = 4;
        }else if(nilaiAkhirD26.equals("B+")){
            nilaiSetaraD26 = 3.5;
        }else if(nilaiAkhirD26.equals("B")){
            nilaiSetaraD26 = 3;
        }else if(nilaiAkhirD26.equals("C+")){
            nilaiSetaraD26 = 2.5;
        }else if(nilaiAkhirD26.equals("C")){
            nilaiSetaraD26 = 2;
        }else if(nilaiAkhirD26.equals("D")){
            nilaiSetaraD26 = 1;
        }else{
            nilaiSetaraD26 = 0;
        }

        if(nilaiAkhirB26.equals("A")){
            nilaiSetaraB26 = 4;
        }else if(nilaiAkhirB26.equals("B+")){
            nilaiSetaraB26 = 3.5;
        }else if(nilaiAkhirB26.equals("B")){
            nilaiSetaraB26= 3;
        }else if(nilaiAkhirB26.equals("C+")){
            nilaiSetaraB26 = 2.5;
        }else if(nilaiAkhirB26.equals("C")){
            nilaiSetaraB26 = 2;
        }else if(nilaiAkhirB26.equals("D")){
            nilaiSetaraB26 = 1;
        }else{
            nilaiSetaraB26 = 0;
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
        System.out.println("Pancasila                  2     " + Pancasila26 + "   " + nilaiAkhirP26 + "       " + nilaiSetaraP26);
        System.out.println("Dasar Pemrograman          3     " + Daspro26 + "      " + nilaiAkhirD26 + "       " + nilaiSetaraD26);
        System.out.println("Bahasa Inggris             2     " + Bing26 + "        " + nilaiAkhirB26 + "       " + nilaiSetaraB26);
        System.out.println("--------------------------------------------------------------------------");

        double totalSKS = 2 + 3 + 2;
        double totalNilai = (nilaiSetaraP26 * skspancasila26) + (nilaiSetaraD26 * sksdaspro26) + (nilaiSetaraB26 * sksbing26);
        double ip = totalNilai / totalSKS;
        double bobot = totalNilai;

        System.out.println("Total SKS : "+ totalSKS);
        System.out.println("Bobot : " + bobot);
        System.out.println("IP ");
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