import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word;
        
        while (true) {
            System.out.print("Type a word: ");
            word = reader.nextLine();
            words.add(word);
            if (word.isEmpty()) {
                for (String answer : words) {
                    System.out.println(answer);
                }
                break;
            }
        }
        
    }
}
