package Questions;
import java.util.Scanner;

public class Boston {

    // Function to calculate sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;

        int sumDigits = sumOfDigits(n);
        int sumPrimeFactors = 0;

        // Prime factorization
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                sumPrimeFactors += sumOfDigits(i);
                n = n / i;
            }
        }

        // Check if composite and Boston
        if (sumDigits == sumPrimeFactors && original != 2) {
            System.out.println("Boston Number");
        } else {
            System.out.println("Not a Boston Number");
        }

        sc.close();
    }
}
