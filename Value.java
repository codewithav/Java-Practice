import java.util.Scanner;

public class Value {
    public static void main(String[] args) {
        //linear search
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Find the position of: ");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("Position of the number: " + (i + 1));
            }
        }
        sc.close();
    }
}
