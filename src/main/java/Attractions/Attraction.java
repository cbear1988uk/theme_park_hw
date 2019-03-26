package Attractions;

import Behaviours.IReviewed;

import java.util.ArrayList;

public abstract class Attraction {

    private String name;
    private Integer rating;
    private ArrayList<IReviewed> reviews;

    public Attraction(String name, Integer rating){
        this.name = name;
        this.rating = rating;
        this.reviews = new ArrayList<IReviewed>();
    }

    public String getName(){
        return this.name;
    }

    public int getRating(){
        return this.rating;
    }

}
