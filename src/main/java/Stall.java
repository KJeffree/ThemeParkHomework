public abstract class Stall {

    protected String name;
    protected String ownerName;
    protected int parkingSpot;
    protected int rating;

    public Stall(String name, String ownerName, int parkingSpot){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = 0;
    }

    public String getName(){
        return this.name;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public int getParkingSpot(){
        return this.parkingSpot;
    }

    public int getRating(){
        return this.rating;
    }
}
