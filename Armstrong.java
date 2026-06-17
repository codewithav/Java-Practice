import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int og = n;
        int temp = n;
        int sum = 0;
        int l = 0;
        while (temp != 0) {
            temp = temp / 10;
            l++;
        }
        while (n != 0) {
            int k = n % 10;
            sum = sum + (int) Math.pow(k, l);
            n = n / 10;
        }
        if (og == sum) {
            System.out.println("ArmStrong");
        } else {
            System.out.println("Not ArmStrong");
        }
        sc.close();
    }
}
