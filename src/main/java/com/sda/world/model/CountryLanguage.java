package com.sda.world.model;

import javax.persistence.*;

@Entity
@Table(name="countrylanguage")
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id;

    @Enumerated(EnumType.STRING)
    @Column(name="IsOfficial")
    private IsOfficial isOfficial;

    @Column(name="Percentage")
    private float percentage;

    @ManyToOne
    @JoinColumn(name="countryCode")
    @MapsId("countryCode")
    private Country country;

    public CountryLanguageId getId() {
        return id;
    }

    public void setId(CountryLanguageId id) {
        this.id = id;
    }

    public IsOfficial getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(IsOfficial isOfficial) {
        this.isOfficial = isOfficial;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
