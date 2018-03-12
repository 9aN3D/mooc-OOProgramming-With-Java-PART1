
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        if (value < upperLimit) {
            this.value++;
        } else {
            this.value = 0;
        }
    }

    public String toString() {
        // write code here
        return value < 10 ? "0" + value : "" + value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        if (value >= 0 && value <= upperLimit) this.value = value;
    }
}
