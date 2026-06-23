package Questions;

import java.util.Scanner;


public class Largestnum {
    
    public static void main(String[]a){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num>num1){
           if(num1>num2){
               System.out.print(num);
           }
        }
        else if (num1>num){
            if(num>num2){
                System.out.print(num1);
            }

        } else{
            System.out.print(num2);
        }
sc.close();

    }
}

