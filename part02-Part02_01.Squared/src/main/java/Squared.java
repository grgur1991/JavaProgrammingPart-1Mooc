
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int square = num * num;
        System.out.println("The square of " + num + " is " + square);
        
        

    }
}
