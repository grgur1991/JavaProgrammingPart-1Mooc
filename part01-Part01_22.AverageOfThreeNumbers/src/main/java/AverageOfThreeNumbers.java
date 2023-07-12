
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        
        int number1 = Integer.valueOf( scanner.nextInt());
        
        System.out.println("Give the second number:");
        
        int number2=  Integer.valueOf( scanner.nextInt());
        System.out.println("Give the third number:");
        
        int number3=  Integer.valueOf( scanner.nextInt());
        
        double sum = (number1 + number2 + number3) / (double) 3;
        
        System.out.println("The average is " + sum);
        

    }
}
