package com.app.bobedst.model;

public class Location {

    private long id;
    private String road;
    private String addressNumber;
    private int postNumber;
    private String city;

    public Location(long id, String road, String addressNumber, int postNumber, String city) {
        this.id = id;
        this.road = road;
        this.addressNumber = addressNumber;
        this.postNumber = postNumber;
        this.city = city;
    }
}
