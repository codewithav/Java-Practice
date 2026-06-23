package Questions;

import java.util.Scanner;

public class Bitconversion {
    public static int reverse(int n) {
        int reverse = 0;
        while (n != 0) {
            int k = n % 10;
            reverse = reverse * 10 + k;
            n = n / 10;

        }
        return reverse;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bn = 1;
        while (n > 0) {
            int k = n % 2;
            bn = bn * 10 + k;
            n = n / 2;
        } System.out.println(reverse(bn)/10);

        sc.close();

    }

}
