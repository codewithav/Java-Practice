
import java.util.Scanner;

public class Fibbonaci{
    public static int fibbonaci(int g) {
        if (g == 0 || g == 1) {
            return g;
        }
        return fibbonaci(g - 1) + fibbonaci(g - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(fibbonaci(g) + " ");
                g++;
            }

            System.out.println();

            sc.close();
        }

    }
}
