import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int randomizerLenght;
    private Random random = new Random();
    private String symbols;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        randomizerLenght = length;
        random = new Random();
        symbols = "abcdefghijklmnopqrstuvwxyz";
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        for (int i = 0; i < randomizerLenght; ++i) {
            password += symbols.charAt((int)random.nextInt(25));
        }
        return password;
    }
}
