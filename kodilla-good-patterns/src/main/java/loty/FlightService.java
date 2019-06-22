package loty;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    private List<Flight> flights = new ArrayList<>();

    public FlightService() {
        flights.add(new Flight("Lublin", "Warszawa"));
        flights.add(new Flight("Krakow", "Warszawa"));
        flights.add(new Flight("Warszawa", "Katowice"));
        flights.add(new Flight("Lublin", "Rzeszow"));
        flights.add(new Flight("Gdansk", "Warszawa"));
        flights.add(new Flight("Lublin", "Zakopane"));
    }

    public List<Flight> flightsFrom(String city) {
        return flights.stream()
                .filter(flight -> flight.getFlightFrom().equals(city))
                .collect(Collectors.toList());
    }

    public List<Flight> flightsTo(String city) {
        return flights.stream()
                .filter(flight -> flight.getFlightTo().equals(city))
                .collect(Collectors.toList());
    }

    public List<Connection> flightsThr(String cityFrom, String cityBy, String cityTo) {
        List<Flight> flightFrom = flights.stream()
                .filter(flight -> flight.getFlightFrom().equals(cityFrom) &&
                        flight.getFlightTo().equals(cityBy))
                .collect(Collectors.toList());

        List<Flight> flightTo = flights.stream()
                .filter(flight -> flight.getFlightFrom().equals(cityBy) &&
                        flight.getFlightTo().equals(cityTo))
                .collect(Collectors.toList());

        List<Connection> connections = new ArrayList<>();
        for (Flight flight1 : flightFrom) {
            for (Flight flight2 : flightTo) {
                Connection connection = new Connection(flight1, flight2);
                connections.add(connection);
            }
        }
        return connections;
    }
}