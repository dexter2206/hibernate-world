package com.sda.world.model;

import javax.persistence.*;

@Entity
@Table(name="city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;

    @Column(name="Name")
    private String name;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CountryCode")
    private Country country;

    @Column(name="District")
    private String district;

    public City() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}

