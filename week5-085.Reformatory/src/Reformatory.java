public class Reformatory {
    private int count;

    public int weight(Person person) {
        // return the weight of the person
        count++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int weight = weight(person);
        weight++;
        person.setWeight(weight);
    }
    
    public int totalWeightsMeasured() {
        return count;
    }
}
