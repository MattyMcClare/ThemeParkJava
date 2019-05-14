package ThemePark;

import Interface.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IReviewed> reviews;

    public ThemePark(String name) {
        this.name = name;
        this.reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int reviewsCount(){
        return reviews.size();
    }

    public void addReview(IReviewed review){
        reviews.add(review);
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return reviews;
    }
}
