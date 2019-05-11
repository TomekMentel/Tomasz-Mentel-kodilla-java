package com.kodilla.stream.world;

import java.util.List;

public class Continent {
    private List<Country> countries;
    private String continent;

    public Continent(List<Country> countries, String continent) {
        this.countries = countries;
        this.continent = continent;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public String getContinent() {
        return continent;
    }
}
