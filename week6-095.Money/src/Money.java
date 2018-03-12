
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        return new Money(euros + added.euros, cents + added.cents);
    }
    
    public boolean less(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        }

        if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }

        return false; 
    }
    
    public Money minus(Money decremented) {

        if (this.less(decremented)) {
            int eurosTmp = 0;
            int centsTmp = 0;

            return new Money(eurosTmp, centsTmp);
        } else {
            int eurosTmp = this.euros - decremented.euros;
            int centsTmp = this.cents - decremented.cents;
            if (this.cents < decremented.cents) {
                eurosTmp--;
                centsTmp = 100 - decremented.cents;
            }

            return new Money(eurosTmp, centsTmp);
        }
    }
    
}
