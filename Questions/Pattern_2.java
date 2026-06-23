package Questions;
import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print(k + " ");
                } else if (i == 3 && j == 3) {
                    System.out.print(i + j + " ");
                } else if (i == j) {
                    System.out.print(k + 1 + " ");
                } else if (i + j == 5 || i + j == 7) {
                    System.out.print(k + 2 + " ");
                } else {
                    System.out.print(k + 3 + " ");
                }

            }

            System.out.println();
        }
        sc.close();
    }
}
