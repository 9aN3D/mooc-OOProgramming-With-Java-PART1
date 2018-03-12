
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int lasttNumber = Integer.parseInt(reader.nextLine());
        int sum = 0;
        for (int i = firstNumber; i <= lasttNumber; ++i ) {
            sum += i;
        }
        System.out.println("Sum is " + sum);
        
    }
}
