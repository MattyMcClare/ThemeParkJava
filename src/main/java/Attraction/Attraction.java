package Attraction;

import Interface.IReviewed;

public abstract class Attraction implements IReviewed {

    private int rating;
    private String name;

    public Attraction(int rating, String name) {
        this.rating = rating;
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }
}
