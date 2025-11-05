package P10;

import java.util.Scanner;

public class P10Tugas2 {
    public static void main(String[] args) {
       Scanner Raja26 = new Scanner (System.in);
        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = Raja26.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal harus 3");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
                
            } 
            System.out.println();
            
        }
        
    }
}