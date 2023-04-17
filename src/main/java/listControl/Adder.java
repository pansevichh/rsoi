package listControl;

import entities.Trip;
import entities.User;
import entities.Violation;
import logic.InputData;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class Adder {
    public User addNewUser(Scanner scanner) throws ParseException {
        User user = new User();
        List<Violation> violationHistory = new ArrayList<>();
        List<Trip> tripsHistory = new ArrayList<>();
        user.setviolations(violationHistory);
        user.settripsHistory(tripsHistory);
        InputData inputData = new InputData();
        inputData.input(user,scanner , violationHistory, tripsHistory);
        System.out.println("Successfully added, your id:  " + user.getId());
        System.out.println();
        return user;
    }
}
