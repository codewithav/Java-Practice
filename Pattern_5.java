
import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print("  ");
            }
           if (i%2==0) {
            System.out.print("* ");
           } else {
            System.out.print("  ");
           }
        }
        sc.close();
    }
}
