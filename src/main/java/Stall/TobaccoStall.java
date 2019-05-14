package Stall;

public class TobaccoStall extends Stall {

    private int minAge;

    public TobaccoStall(String name, int rating, String ownerName, String parkingSpot) {
        super(name, rating, ownerName, parkingSpot);
        this.minAge = 18;
    }

    public int getMinAge() {
        return minAge;
    }
}
