import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
        random = new Random();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int number;
        while (numbers.size() <= 6) {
            number = random.nextInt(39)+1;
            if (!containsNumber(number)) this.numbers.add(number) ;
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return numbers.contains(number);
    }
}
