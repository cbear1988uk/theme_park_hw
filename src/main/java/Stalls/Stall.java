package Stalls;

public abstract class Stall {

    public String name;
    public String ownerName;
    public String parkingSpot;
    public Integer rating;

    public Stall(String name, String ownerName, String parkingSpot, Integer rating){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getName(){
        return this.name;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public String getParkingSpot(){
        return this.parkingSpot;
    }

    public int getRating(){
        return this.rating;
    }
}
