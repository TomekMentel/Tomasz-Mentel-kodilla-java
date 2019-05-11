package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {

    private List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal result = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (x, y) -> x = x.add(y));

        return result;
    }

    public List<Continent> getContinents() {
        return continents;
    }
}
