
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
     Scanner reader = new Scanner(System.in);
        
        BirdWatcher birdWatcher = new BirdWatcher();

        while (true) {

            String userInput; //stores the user input here

            System.out.print("?");
            userInput = reader.nextLine();

            if (userInput.equalsIgnoreCase("Quit")) {
                break;
            } else if (userInput.equalsIgnoreCase("Add")) {
                addBird(reader, birdWatcher);
            } else if (userInput.equalsIgnoreCase("observation")) {
                System.out.println("What was observed:?");
                String birdName = reader.nextLine();
                increaseCount(birdName, birdWatcher);
            } else if (userInput.equalsIgnoreCase("Statistics")) {
                birdWatcher.statistics();
            } else if (userInput.equalsIgnoreCase("show")) {
                System.out.println("What?");
                String birdName = reader.nextLine();
                showBird(birdName, birdWatcher);
            }
        }
    }

    private static void addBird(Scanner reader, BirdWatcher birdWatcher) {
        System.out.println("Name:");
        String inputName = reader.nextLine();
        System.out.println("Latin Name:");
        String inputLatinName = reader.nextLine();
        birdWatcher.addBird(inputName, inputLatinName);
    }

    public static void increaseCount(String bird, BirdWatcher birdWatcher) {
        for (Bird b : birdWatcher.getBirds()) {
            if (b.getName().equalsIgnoreCase(bird) || b.getlatinName().equalsIgnoreCase(bird)) {
                b.increaseCount();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }

    public static void showBird(String bird, BirdWatcher birdWatcher) {
        for (Bird b : birdWatcher.getBirds()) {
            if (b.getName().equalsIgnoreCase(bird) || b.getlatinName().equalsIgnoreCase(bird)) {
                System.out.println(b);
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
    

}
