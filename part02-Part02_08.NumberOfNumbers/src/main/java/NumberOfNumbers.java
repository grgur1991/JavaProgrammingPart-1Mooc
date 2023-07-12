
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int input = 1; // initialize input to a non-zero value

        while (input != 0) {
            System.out.println("Give a number:");
            input = scanner.nextInt();
            if (input != 0) {
                count = count +1;
            }
        }

        System.out.println("Number of numbers: " + count);

    }
}
