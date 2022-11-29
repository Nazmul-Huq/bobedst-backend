package com.app.bobedst.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",
    nullable = false,
    unique = true)
    private long id;
    @Column(name = "road",
            nullable = false)
    private String road;
    @Column(name = "address_number",
            nullable = false)
    private String addressNumber;
    @Column(name = "post_number",
            nullable = false)
    private int postNumber;
    @Column(name = "city",
            nullable = false)
    private String city;

    /*public Location(long id, String road, String addressNumber, int postNumber, String city) {
        this.id = id;
        this.road = road;
        this.addressNumber = addressNumber;
        this.postNumber = postNumber;
        this.city = city;
    }
     */
}
