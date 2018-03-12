
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the points [0-60]: ");
        int point = Integer.parseInt(reader.nextLine());
        String grade = "";
                
        if (point >= 0 && point < 30) {
            grade = "failed";
        } else if ( 30 <= point && point < 35 ) {
            grade = "1";
        } else if ( 35 <= point && point < 40 ) {
            grade = "2";
        } else if ( 40 <= point && point < 45 ) {
            grade = "3";
        } else if ( 45 <= point && point < 50 ) {
            grade = "4";
        } else if ( 50 <= point && point < 60 ) {
            grade = "5";
        } 
        System.out.println("Grade: " + grade);
    }
}
