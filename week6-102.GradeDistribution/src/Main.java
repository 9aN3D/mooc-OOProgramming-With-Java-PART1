import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
         Scanner reader = new Scanner(System.in);

        System.out.println("Type exam scores, -1 completes:");

        Grade grade = new Grade();

        grade.doSomething(reader);
        grade.printStars();
        grade.printAcceptance();
    }
}
