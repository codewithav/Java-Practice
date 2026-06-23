package Questions;
import java.util.Scanner;
class Addnum{
    public static void main (String[]a){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x + y;
        System.out.println("Sum of the numbers: " + sum);
        sc.close(); 
    } 
   
}