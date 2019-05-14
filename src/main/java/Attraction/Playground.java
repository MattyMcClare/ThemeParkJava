package Attraction;

import Interface.ISecurity;
import Visitor.Visitor;

public class Playground extends Attraction implements ISecurity {

    private int minAge;

    public Playground(int rating, String name) {
        super(rating, name);
        this.minAge = 15;
    }

    public int getMinAge() {
        return minAge;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= minAge;
    }
}
