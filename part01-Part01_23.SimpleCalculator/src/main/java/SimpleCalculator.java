
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
          int num1 = Integer.valueOf( scanner.nextInt());
          
           System.out.println("Give the second number:");
          int num2 = Integer.valueOf( scanner.nextInt());
          
            int sum = num1 + num2;          
            int difference = num1 - num2;         
            int product = num1 * num2;     
            double quotient = (double) num1 / num2;
            
            System.out.println(num1 + " + " + num2 + " = " + sum);       
            System.out.println(num1 + " - " + num2 + " = " + difference);
            System.out.println(num1 + " * " + num2 + " = " + product);
            System.out.println(num1 + " / " + num2 + " = " + quotient);

 
 
    }
}
