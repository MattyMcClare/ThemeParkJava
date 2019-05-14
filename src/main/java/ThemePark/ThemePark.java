package ThemePark;

import Attraction.Attraction;
import Interface.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IReviewed> reviews;
    private ArrayList<Attraction> attractions;

    public ThemePark(String name) {
        this.name = name;
        this.reviews = new ArrayList<>();
        this.attractions = new ArrayList<>();

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

    public int attractionsCount(){
        return attractions.size();
    }

    public void addAttraction(Attraction attraction){
        attractions.add(attraction);
    }
}
