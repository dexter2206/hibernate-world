package com.sda.world.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CountryLanguageId implements Serializable {

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Column(name="CountryCode")
    private String countryCode;

    @Column(name="Language")
    private String language;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryLanguageId that = (CountryLanguageId) o;

        if(!Objects.equals(this.countryCode, that.countryCode)) return false;
        return Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        int result = countryCode.hashCode();
        result = 31 * result + language.hashCode();
        return result;
    }
}
