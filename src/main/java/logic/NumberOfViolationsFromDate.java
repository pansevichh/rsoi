package logic;

import entities.Violation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class NumberOfViolationsFromDate {
    int numberOfViolations;
    @Autowired


    public int numberOfViolationsFromDate(LocalDate startDate, List<Violation> violationList) {
        for (Violation v : violationList) {
            if (v.getDateOfViolation().compareTo(startDate) > 0) {
                numberOfViolations++;
            }
        }
        return numberOfViolations;
    }
}
