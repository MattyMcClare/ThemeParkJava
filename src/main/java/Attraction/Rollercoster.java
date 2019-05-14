package Attraction;

import Interface.ISecurity;
import Visitor.Visitor;

public class Rollercoster extends Attraction implements ISecurity {

    private int minAge;
    private int minHeight;

    public Rollercoster(int rating, String name) {
        super(rating, name);
        this.minAge = 12;
        this.minHeight = 145;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= minAge && visitor.getHeight() >= minHeight;
    }
}
