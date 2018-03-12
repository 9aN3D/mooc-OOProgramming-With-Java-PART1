
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int priceOfApartment;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.priceOfApartment = pricePerSquareMeter * squareMeters;
    }
    
    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment) {
        if (larger(otherApartment)) {
            return (this.squareMeters * this.pricePerSquareMeter) -
                   (otherApartment.squareMeters * otherApartment.pricePerSquareMeter);
        } else {
            return (otherApartment.squareMeters * otherApartment.pricePerSquareMeter) -
                   (this.squareMeters * this.pricePerSquareMeter); 
        }
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        return this.priceOfApartment > otherApartment.priceOfApartment;
    }
}
