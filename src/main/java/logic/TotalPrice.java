package logic;

import entities.Trip;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TotalPrice {
    double totalPrice = 0;

    public double getTotalPrice(List<Trip> tripsHistory) {
        for (Trip t : tripsHistory) {
            totalPrice += t.getPriceOfTrip();
        }
        return totalPrice;
    }
}
