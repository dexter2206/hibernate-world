package com.sda.world.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="country")
public class Country {

    @Id
    @Column(name="Code")
    private String code;

    @Column(name="Name")
    private String name;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Capital")
    private City capital;

    @Column(name="Code2")
    private String code2;

    @OneToMany(mappedBy="country", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<City> cities;

    @OneToMany(mappedBy="country", fetch = FetchType.LAZY)
    private Set<CountryLanguage> languages;

    public Country() {}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public Set<CountryLanguage> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<CountryLanguage> languages) {
        this.languages = languages;
    }

    public void addCity(City city) {
        if(city != null) {
            this.cities.add(city);
            city.setCountry(this);
        }
    }
}
