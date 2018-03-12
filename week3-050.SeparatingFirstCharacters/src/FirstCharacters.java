import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        if (name.length()-1 > 2) {
            System.out.print(separatingFirstCharacters(name));
        }
        
    }
    
    // do here the method
    public static String separatingFirstCharacters(String text) {
        String answer = "";
        for (int i = 0; i < 3; ++i ) {
            answer += i+1 + ". character: " + text.charAt(i) + "\n";
        }
        return answer;
    }
}
