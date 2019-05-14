package Stall;

import Interface.ISecurity;
import Visitor.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    private int minAge;

    public TobaccoStall(String name, int rating, String ownerName, String parkingSpot) {
        super(name, rating, ownerName, parkingSpot);
        this.minAge = 18;
    }

    public int getMinAge() {
        return minAge;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= minAge;
    }
}
