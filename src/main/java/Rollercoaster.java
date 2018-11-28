public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name){
        super(name);
        this.rating = 5;
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getHeight() < 145){
            return false;
        } else {
            return true;
        }
    }
}
