package Questions;

import java.util.Scanner;

public class Kmtomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilometer = sc.nextInt();
        System.out.println(kilometer * 0.6213712);
        sc.close();
    }
}
