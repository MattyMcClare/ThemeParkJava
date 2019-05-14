package Attraction;

import Interface.IReviewed;

public class Rollercoster extends Attraction {

    private int minAge;

    public Rollercoster(int rating, String name) {
        super(rating, name);
        this.minAge = 12;
    }

    public int getMinAge() {
        return minAge;
    }
}
