package P10;

import java.util.Scanner;

public class Square26 {
    public static void main(String[] args) {
        
        Scanner Raja26 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = Raja26.nextInt();
        
        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int i = 1; i <= N; i++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        
        Raja26.close();
    }
}

