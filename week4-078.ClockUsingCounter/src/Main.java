
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());// read the initial value of seconds from the user
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());// read the initial value of minutes from the user
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());// read the initial value of hours from the user

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        
        for (int i = 0; i < 121; ++i) {
            System.out.println( hours + ":" + minutes + ":" + seconds);   // the current time printed
            
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
    }
}
