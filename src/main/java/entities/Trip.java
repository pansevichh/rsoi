package entities;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

public class Trip {
    private double priceOfTrip;
    private LocalDate dateOfTrip;

    public Trip(double priceOfTrip, LocalDate dateOfTrip) {
        this.priceOfTrip = priceOfTrip;
        this.dateOfTrip = dateOfTrip;
    }

    public double getPriceOfTrip() {
        return priceOfTrip;
    }

    public void setPriceOfTrip(double priceOfTrip) {
        this.priceOfTrip = priceOfTrip;
    }

    public LocalDate getDateOfTrip() {
        return dateOfTrip;
    }

    public void setDateOfTrip(LocalDate dateOfTrip) {
        this.dateOfTrip = dateOfTrip;
    }
}
