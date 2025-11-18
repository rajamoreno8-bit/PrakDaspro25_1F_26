package P12;

import java.util.Scanner;

public class Tugass26 {
    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);

        int responden = 10,pertanyaan = 6;
        int [][] hasilSurvey = new int[responden][pertanyaan];

        for (int i = 0; i < hasilSurvey.length; i++) {
            System.out.println("Responden Ke - " + (i + 1));
            double totalResponden = 0, rataResponden = 0;

            for (int j = 0; j < hasilSurvey[i].length; j++) {
                System.out.print("Pertanyaan Ke - " +(j+1)+ "Masukkan Rentan Nilai (1-5): ");
                hasilSurvey[i][j] = Raja26.nextInt();
                totalResponden += hasilSurvey[i][j];
            }
            rataResponden = totalResponden / pertanyaan;
            System.out.println("Nilai Rata - Rata Responden " + (i+1) + " Yaitu: " + rataResponden);
        }
        for (int j = 0; j < pertanyaan; j++) {
            double totalPertanyaan = 0, rataPertanyaan = 0;

            for (int i = 0; i < responden; i++) {
                totalPertanyaan += hasilSurvey[i][j];
            }
            rataPertanyaan = totalPertanyaan / responden;
            System.out.println("Rata - Rata Pertanyaan " + (j+1) + " Yaitu: " + rataPertanyaan);
            }
        }
        
        }
    

