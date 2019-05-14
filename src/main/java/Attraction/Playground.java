package Attraction;

public class Playground extends Attraction {

    private int minAge;

    public Playground(int rating, String name) {
        super(rating, name);
        this.minAge = 15;
    }

    public int getMinAge() {
        return minAge;
    }
}
