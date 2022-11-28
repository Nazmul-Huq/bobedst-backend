package com.app.bobedst.model;

public class Properties extends Location{

    private long id;
    private double size;
    private double rent;
    private Location location;
    private int room;
    private double deposit;
    private double prepaidRent;
    private boolean availableToRent;
    private double paymentToHeat;
    private double paymentToWater;

    public Properties(long id, double size, double rent, Location location, int room, double deposit, double prepaidRent, boolean availableToRent, double paymentToHeat, double paymentToWater) {
        super(id, road, addressNumber, postNumber, city);

        this.id = id;
        this.size = size;
        this.rent = rent;
        this.location = location;
        this.room = room;
        this.deposit = deposit;
        this.prepaidRent = prepaidRent;
        this.availableToRent = availableToRent;
        this.paymentToHeat = paymentToHeat;
        this.paymentToWater = paymentToWater;
    }

}
