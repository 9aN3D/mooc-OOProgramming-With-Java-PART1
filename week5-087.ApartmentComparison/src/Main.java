
public class Main {

    public static void main(String[] args) {
        // write testcode here
        Apartment studioManhattan = new Apartment(1,20,1000);
        Apartment twoRoomsBrooklyn = new Apartment(2,30,2000);
        Apartment fourAndKitchenBronx = new Apartment(2, 23, 1500);

        System.out.println( twoRoomsBrooklyn.moreExpensiveThan(studioManhattan) );        // 71600
        System.out.println( fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn) );    // 35400
     
    }
}
