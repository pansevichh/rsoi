package logic;

import entities.Trip;
import entities.User;
import entities.Violation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

@Service
public class InputData {
    public void input(User user, Scanner scanner, List<Violation> violationList, List<Trip> tripsHistory) {
        System.out.print("Enter the name:  ");
        user.setName(scanner.next());
        System.out.print("Enter the age:  ");
        user.setAge(scanner.nextInt());
        System.out.print("Enter the driver experience in full years:  ");
        user.setDrivingExperience(scanner.nextLong());

        System.out.println("Any violations? Type yes / no");
        if (scanner.next().equals("yes")) {
            System.out.println("Enter the content and data like this:");
            System.out.println("speed warning   yyyy-mm-dd");
            violationList.add(new Violation(scanner.next(), LocalDate.parse(scanner.next())));
        }
        System.out.println("Any trips to add? Type yes / no");
        if (scanner.next().equals("yes")) {
            System.out.println("Enter the price and data like this:");
            System.out.println("2,34   yyyy-mm-dd");
            tripsHistory.add(new Trip(scanner.nextDouble(), LocalDate.parse(scanner.next())));
        }
    }
}
