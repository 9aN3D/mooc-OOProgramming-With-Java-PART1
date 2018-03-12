public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        hours = new BoundedCounter(23);
        hours.setValue(hoursAtBeginning);
        minutes = new BoundedCounter(59);
        minutes.setValue(minutesAtBeginning);
        seconds = new BoundedCounter(59);
        seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        // Clock advances by one second
        if(seconds.getValue() == 59){    
               if(minutes.getValue() == 59) {
                    if(hours.getValue() == 23){
                        hours.setValue(0);
                    } else {
                        hours.next();
                    }
                }
                minutes.next();
                seconds.next();
            } else {
                seconds.next();
            }
    }
    
    public String toString() {
        // returns the string representation
        return hours +":" + minutes + ":" + seconds;
    }
}
