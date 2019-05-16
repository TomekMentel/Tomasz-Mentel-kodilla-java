package com.kodilla.exception.test;

public class Main {
    public static void main(String[] args) throws RouteNotFoundException {

        Flight flight = new Flight("Arland", "Balic");

        FlightFind flightFind = new FlightFind();

        try {
            flightFind.findFlight(flight);

        } catch (RouteNotFoundException e) {
            System.out.println("Error: No Flight" + e);
        } finally {
            System.out.println("Wizzair");
        }
    }
}