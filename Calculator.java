import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        String product = sc.next();   
        int num2 = sc.nextInt();

        switch (product) {
            case "+":
                System.out.println(num1 + num2);
                break;

            case "-":
                System.out.println(num1 - num2);
                break;

            case "*":
                System.out.println(num1 * num2);
                break;

            case "/":
                if (num2 != 0)
                    System.out.println(num1 / num2);
                else
                    System.out.println("Cannot divide by zero");
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}
