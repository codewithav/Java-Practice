package Questions;

import java.util.Scanner;

public class markstogpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        double gpa = (sum * 4.0) / 300;
        System.out.println(gpa);
        sc.close();
    }
}
