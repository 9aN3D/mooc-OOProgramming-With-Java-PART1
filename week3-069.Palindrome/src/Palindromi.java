import java.util.Collection;
import java.util.Scanner;

public class Palindromi {
    
    public static String reverse(String text) {
        String answer = "";
        for (int i = 0; i <= text.length()-1; ++i ) {
            answer += text.charAt(text.length()-(1+i));
        }
        return answer;
    }

    public static boolean palindrome(String text) {
        // write code here
        if (text.equals(reverse(text))) return true;
            return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
