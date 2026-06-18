import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Inverse {
    public static ArrayList<Integer> convert(int n) {
        ArrayList<Integer> number = new ArrayList<>();
        while (n != 0) {
            int k = n % 10;
            number.add(k);
            n = n / 10;
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> number = convert(n);
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(number.size() + 1, 0));
        for (int i = 0; i < number.size(); i++) {
            ans.set(number.get(i), i + 1);
        }
        for (int i = number.size(); i >= 1; i--) {
            System.out.print(ans.get(i));
        }
        sc.close();
    }
}
