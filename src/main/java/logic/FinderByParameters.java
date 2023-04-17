package logic;

import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

@Service
public class FinderByParameters {
    long drivingExperience;
    int numberOfMonths;
    int numberOfTrips;
    LocalDate startDate = LocalDate.now();
    int numberOfViolations;
    double totalPrice;

    @Autowired
    NumberOfViolationsFromDate violNumber;
    NumberOfTripsForNMonths tripsNumber;
    TotalPrice totPrice;

    public void findByParameters(Scanner scanner, List<User> users) {
            System.out.println("-------");
            System.out.println("There'll be some parameters shown." +
                    "If you want to search by it, type yes");
            System.out.println("-------");

            insertParameters(scanner);

            System.out.println("Okay, let's find some user by your parameters:");
            System.out.println("Driving experience:  " + drivingExperience);
            System.out.println("Number of trips for " + numberOfMonths + " months:  " + numberOfTrips);
            //NumberOfTripsForNMonths tripsNumber = new NumberOfTripsForNMonths();
            //NumberOfViolationsFromDate violNumber = new NumberOfViolationsFromDate();
            System.out.println("Number of violations from  " + startDate + ":  " + numberOfViolations);
            System.out.println("Total price:  " + totalPrice);
            //TotalPrice totPrice = new TotalPrice();
            System.out.println();

            for (User n: users) {
                if (((n.getDrivingExperience() == drivingExperience) || drivingExperience == 0)
                        && ((tripsNumber.numberOfTripsForNMonths(numberOfMonths, n.gettripsHistory()) == numberOfTrips) || numberOfTrips == 0)
                        && ((violNumber.numberOfViolationsFromDate(startDate, n.getviolations()) == numberOfViolations) || numberOfViolations == 0)
                        && ((totPrice.getTotalPrice(n.gettripsHistory()) == totalPrice) || totalPrice == 0)
                ) {
                    n.printUserInfo(n);
                    System.out.println();
                }
            }
        }

        public void insertParameters(Scanner scanner) {
            System.out.println("Driving experience? yes/no");
            if (scanner.next().equals("yes")) {
                drivingExperience = scanner.nextLong();
            }
            System.out.println("Number of trips for N months? yes/no");
            if (scanner.next().equals("yes")) {
                System.out.println("Enter number of months to search back");
                numberOfMonths = scanner.nextInt();
                System.out.println("Enter number of trips the user has to have during this period");
                numberOfTrips = scanner.nextInt();
            }
            System.out.println("Number of violations starting from N date? yes/no");
            if (scanner.next().equals("yes")) {
                System.out.println("Enter the date to start from in yyyy-mm-dd format");
                startDate = LocalDate.parse(scanner.next());
                System.out.println("Enter number of violations");
                numberOfViolations = scanner.nextInt();
            }
            System.out.println("Total price? yes/no");
            if (scanner.next().equals("yes")) {
                System.out.println("Enter total price");
                totalPrice = scanner.nextDouble();
            }
    }
}
