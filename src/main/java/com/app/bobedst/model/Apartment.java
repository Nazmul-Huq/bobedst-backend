package com.app.bobedst.model;

public class Apartment extends Properties {

    private boolean storageRoom;
    private boolean privateGarden;
    private boolean laundryRoom;
    private String floor;
    private String apartmentNumber;

    public Apartment(boolean storageRoom, boolean privateGarden, boolean laundryRoom, String floor, String apartmentNumber, long id, double size, double rent, Location location, int room, double deposit, double prepaidRent, boolean availableToRent, double paymentToHeat, double paymentToWater) {
        super(id, size, rent, location, room, deposit, prepaidRent, availableToRent, paymentToHeat, paymentToWater);

        this.storageRoom = storageRoom;
        this.privateGarden = privateGarden;
        this.laundryRoom = laundryRoom;
        this.floor = floor;
        this.apartmentNumber = apartmentNumber;
    }



}
