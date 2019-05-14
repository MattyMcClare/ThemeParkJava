package Stall;

import Interface.IReviewed;

public abstract class Stall implements IReviewed {

    private String name;
    private int rating;
    private String ownerName;
    private String parkingSpot;

    public Stall(String name, int rating, String ownerName, String parkingSpot) {
        this.name = name;
        this.rating = rating;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }
}
