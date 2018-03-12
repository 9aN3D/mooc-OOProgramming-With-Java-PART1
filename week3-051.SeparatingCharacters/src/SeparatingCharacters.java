
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print(separatingCharacters(name));
               
    }
    
    // do here the method
    public static String separatingCharacters(String text) {
        String answer = "";
        for (int i = 0; i <= text.length()-1; ++i ) {
            answer += i+1 + ". character: " + text.charAt(i) + "\n";
        }
        return answer;
    }
}
