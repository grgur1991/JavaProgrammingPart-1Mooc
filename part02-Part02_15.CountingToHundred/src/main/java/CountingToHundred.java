
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = scanner.nextInt();
        int end = 100;
        
        for(int i = input; i <= end; i++){
            System.out.println(i);
        }
        

    }
}
