import java.util.Scanner;

public class Reversenum{
    public static int reverseDigits(int num) {
        String str = Integer.toString(num);
        String reversed = new StringBuilder(str).reverse().toString();
        return Integer.parseInt(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int original = sc.nextInt();
        int reversed = reverseDigits(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        sc.close();

    }
}
