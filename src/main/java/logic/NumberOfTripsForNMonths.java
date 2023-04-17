package logic;

import entities.Trip;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class NumberOfTripsForNMonths {
    int numberOfTrips;

    public int numberOfTripsForNMonths(int monthsToSubtract, List<Trip> tripsHistory) {
        LocalDate startDate = LocalDate.now().minusMonths(monthsToSubtract);
        for (Trip t : tripsHistory) {
            if (t.getDateOfTrip().compareTo(startDate) > 0) {
                numberOfTrips++;
            }
        }
        return numberOfTrips;
    }
}
