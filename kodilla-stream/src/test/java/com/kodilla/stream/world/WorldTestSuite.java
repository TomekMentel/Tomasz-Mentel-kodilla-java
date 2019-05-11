package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //Given
        List<Country> africa = new ArrayList<>();
        List<Country> europe = new ArrayList<>();
        List<Country> southAmerica = new ArrayList<>();
        List<Continent> continents = new ArrayList<>();
        //When
        africa.add(new Country("Nigeria", new BigDecimal("12345678")));
        africa.add(new Country("Algeria", new BigDecimal("12345678")));
        africa.add(new Country("Nigeria'", new BigDecimal("12345678")));
        africa.add(new Country("Egipt", new BigDecimal("12345678")));

        europe.add(new Country("Polska", new BigDecimal("123456")));
        europe.add(new Country("Niemcy", new BigDecimal("123456")));
        europe.add(new Country("Czechy", new BigDecimal("123456")));
        europe.add(new Country("Francja", new BigDecimal("123456")));

        southAmerica.add(new Country("Argentyna", new BigDecimal("2345645")));
        southAmerica.add(new Country("Brazylia", new BigDecimal("2342345")));
        southAmerica.add(new Country("Boliwia", new BigDecimal("2345515")));
        southAmerica.add(new Country("Ekwador", new BigDecimal("2345325")));

        continents.add(new Continent(europe, "Europe"));
        continents.add(new Continent(africa, "Africa"));
        continents.add(new Continent(southAmerica, "SouthAmerica"));
        //Then
        World world = new World(continents);
        BigDecimal totalPopulation = world.getPeopleQuantity();

        Assert.assertEquals(new BigDecimal("59255366"), totalPopulation);
    }

    @Test
    public void testGetPeopleQuantityZero() {
        //Given
        List<Country> africa = new ArrayList<>();
        List<Country> europe = new ArrayList<>();
        List<Country> southAmerica = new ArrayList<>();
        List<Continent> continents = new ArrayList<>();
        //When
        africa.add(new Country("Nigeria", new BigDecimal("0")));
        africa.add(new Country("Algeria", new BigDecimal("0")));
        africa.add(new Country("Nigeria'", new BigDecimal("0")));
        africa.add(new Country("Egipt", new BigDecimal("0")));

        europe.add(new Country("Polska", new BigDecimal("0")));
        europe.add(new Country("Niemcy", new BigDecimal("0")));
        europe.add(new Country("Czechy", new BigDecimal("0")));

        southAmerica.add(new Country("Argentyna", new BigDecimal("0")));
        southAmerica.add(new Country("Brazylia", new BigDecimal("0")));
        southAmerica.add(new Country("Boliwia", new BigDecimal("0")));
        southAmerica.add(new Country("Ekwador",new BigDecimal("0")));

        continents.add(new Continent(europe, "Europe"));
        continents.add(new Continent(africa, "Africa"));
        continents.add(new Continent(southAmerica, "SouthAmerica"));
        //Then
        World world = new World(continents);
        BigDecimal totalPopulation = world.getPeopleQuantity();

        Assert.assertEquals(new BigDecimal("0"), totalPopulation);
    }

}

