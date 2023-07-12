
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give points [0-100]: ");
        int points = Integer.valueOf( scanner.nextInt());
        String grade;

        if (points < 0) {
            grade = "impossible!";
        } else if (points < 50) {
            grade = "failed";
        } else if (points < 60) {
            grade = "1";
        } else if (points < 70) {
            grade = "2";
        } else if (points < 80) {
            grade = "3";
        } else if (points < 90) {
            grade = "4";
        } else if (points <= 100) {
            grade = "5";
        } else {
            grade = "incredible!";
        }

        System.out.println("Grade: " + grade);

    }
}
