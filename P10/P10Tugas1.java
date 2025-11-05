package P10;

import java.util.Scanner;

public class P10Tugas1 {
    public static void main(String[] args) {
        Scanner Raja26 = new Scanner(System.in);
        System.out.print("Masukkan Nilai N: ");
        int n = Raja26.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("n = " + i + "--> Jumlah Kuadrat = ");

            int jumlah = 0;
            for (int j = 1; j <= i; j++) {
                jumlah += j * j;
                System.out.print(j * j);

                if (j < i) {
                    System.out.print("+");
                } else {
                    System.out.print(" = "+ jumlah);
                }
                
            }
            System.out.println();
        }
      
    }
    
}