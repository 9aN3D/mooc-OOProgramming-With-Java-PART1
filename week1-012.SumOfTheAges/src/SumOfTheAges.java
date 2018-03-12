
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");
        String nameFirstPerson = reader.nextLine();
        System.out.print("Type your age: ");
        int ageFirstPerson = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        System.out.print("Type your name: ");
        String nameSecondPerson = reader.nextLine();
        System.out.print("Type your age: ");
        int ageSecondPerson = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        System.out.println(nameFirstPerson + " and " + nameSecondPerson + 
                " are " + (ageFirstPerson+ageSecondPerson) + " old in total.");
    }
}
