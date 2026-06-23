package Questions;

import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);  
        int sum = 0;
        while (n != 0) {
            int k = n % 10;
            sum = sum + k;
            n /= 10;
        }
        System.out.println(sum);
        sc.close();
    }
}