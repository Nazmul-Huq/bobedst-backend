package com.app.bobedst.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "apartment")
public class Apartment extends Properties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",
    nullable = false,
    unique = true)
    private Long id;
    @Column(name = "storage_room",
    nullable = false)
    private boolean storageRoom;
    @Column(name = "private_garden",
    nullable = false)
    private boolean privateGarden;
    @Column(name = "laundry_room",
    nullable = false)
    private boolean laundryRoom;
    @Column(name = "floor",
    nullable = false)
    private String floor;
    @Column(name = "apartment_number",
    nullable = false)
    private String apartmentNumber;
    private String text;

    /*public Apartment(boolean storageRoom, boolean privateGarden, boolean laundryRoom, String floor, String apartmentNumber, long id, double size, double rent, Location location, int room, double deposit, double prepaidRent, boolean availableToRent, double paymentToHeat, double paymentToWater) {
        super(id, size, rent, location, room, deposit, prepaidRent, availableToRent, paymentToHeat, paymentToWater);

        this.storageRoom = storageRoom;
        this.privateGarden = privateGarden;
        this.laundryRoom = laundryRoom;
        this.floor = floor;
        this.apartmentNumber = apartmentNumber;
    }

     */
}
