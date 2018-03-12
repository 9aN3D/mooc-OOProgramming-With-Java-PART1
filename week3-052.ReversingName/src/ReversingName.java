import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.println("In reverse order: " + reversingName(name));
               
    }
    
    // do here the method
    public static String  reversingName (String text) {
        String answer = "";
        for (int i = 0; i <= text.length()-1; ++i ) {
            answer += text.charAt(text.length()-(1+i));
        }
        return answer;
    }
}
