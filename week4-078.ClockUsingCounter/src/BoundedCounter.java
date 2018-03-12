/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 9an3d
 */
public class BoundedCounter {
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
