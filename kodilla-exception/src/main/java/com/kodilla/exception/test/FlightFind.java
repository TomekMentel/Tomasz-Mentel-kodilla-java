package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFind {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Stansted", true);
        flights.put("Arlanda", false);
        flights.put("Pyrzowice", true);
        flights.put("Balice", false);

        if (flights.containsKey(flight.arrivalAirport))
            return true;
        else
            throw new RouteNotFoundException();
    }
}