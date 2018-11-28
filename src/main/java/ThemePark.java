import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllReviews(){
        ArrayList<IReviewed> allReviews = new ArrayList<>();
        allReviews.add(review);
    }


}
