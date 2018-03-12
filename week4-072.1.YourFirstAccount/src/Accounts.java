
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account michalAccount = new Account("Michal's account", 100);
        
        System.out.println("Initial state");
        System.out.println(michalAccount);
        
        michalAccount.deposit(20);
        
        System.out.println("Michal's account balance is now: " + michalAccount);
        
    }

}
