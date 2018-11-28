public class TobaccoStall extends Stall implements ISecurity{

    public TobaccoStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
        this.rating = 3;
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() < 18){
            return false;
        } else {
            return true;
        }
    }
}
