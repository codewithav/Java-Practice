package Questions;

import java.util.Scanner;

public class Fibbonacisum {
    public static int fibbonaci(int g) {
        if (g == 0 || g == 1) {
            return g;
        }
        return fibbonaci(g - 1) + fibbonaci(g - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n-1; i++) {
            System.out.print(fibbonaci(i) + " ");
        } 
        System.out.println();
        System.out.print("Sum of the digits: " + fibbonaci(n));
        
        sc.close();
    }

}
