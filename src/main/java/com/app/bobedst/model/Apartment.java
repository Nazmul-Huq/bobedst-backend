package com.app.bobedst.model;

import javax.persistence.*;

@Entity
public class Apartment extends Properties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private boolean storageRoom;
    private boolean privateGarden;
    private boolean laundryRoom;
    private String floor;
    private String apartmentNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long iid) {
        this.id = id;
    }

    public Apartment(){}

    public Apartment(boolean storageRoom, boolean privateGarden, boolean laundryRoom, String floor, String apartmentNumber, long id, double size, double rent, Location location, int room, double deposit, double prepaidRent, boolean availableToRent, double paymentToHeat, double paymentToWater) {
        super(size, rent, location, room, deposit, prepaidRent, availableToRent, paymentToHeat, paymentToWater);

        this.storageRoom = storageRoom;
        this.privateGarden = privateGarden;
        this.laundryRoom = laundryRoom;
        this.floor = floor;
        this.apartmentNumber = apartmentNumber;
    }



}
