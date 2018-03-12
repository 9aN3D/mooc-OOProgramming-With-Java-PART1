
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list= new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        
        String name, studentNumber;
        
        while (true) {
            System.out.print("name: ");
            name = reader.nextLine();
                                                
            if (name.isEmpty()) {
                for (Student person : list) {
                    System.out.println(person);
                }
                System.out.println("");
                System.out.print("Give search term: ");
                String search = reader.nextLine();
                System.out.println("Result:");
                for (Student person : list) {
                    if (person.getName().contains(search)) {
                        System.out.println(person);
                    }
                }
                break;
            } else {
                System.out.print("studentnumber: ");
                studentNumber = reader.nextLine();
                list.add(new Student(name, studentNumber));
            }
        }
    }
}
