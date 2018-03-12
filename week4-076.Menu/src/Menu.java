
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal (String meal) {
        if (!meals.contains(meal)) this.meals.add(meal);
    }
    
    public void printMeals() {
        for (String answer : this.meals) {
            System.out.println(answer);
        }
    }
    
    public void clearMenu() {
        meals.removeAll(meals);
    }
}
