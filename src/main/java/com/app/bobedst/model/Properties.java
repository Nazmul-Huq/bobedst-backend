package com.app.bobedst.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@MappedSuperclass
public class Properties{

    @Column(name = "size",
    nullable = false)
    private double size;
    @Column(name = "rent",
            nullable = false)
    private double rent;
    /*@OneToOne
    private Location location;
     */
    @Column(name = "room",
            nullable = false)
    private int room;
    @Column(name = "deposit",
            nullable = false)
    private double deposit;
    @Column(name = "prepaid_rent",
            nullable = false)
    private double prepaidRent;
    @Column(name = "available_to_rent",
            nullable = false)
    private boolean availableToRent;
    @Column(name = "payment_to_heat",
            nullable = false)
    private double paymentToHeat;
    @Column(name = "payment_to_water",
            nullable = false)
    private double paymentToWater;

    /*Pga. Lombok, skal vi ikke have nogen constructor

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

     */

}
