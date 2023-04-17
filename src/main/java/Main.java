import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import entities.Trip;
import entities.User;
import entities.Violation;
import logic.Menu;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws ParseException {
        SpringApplication.run(SpringBootApplication.class, args);
        List<User> users = new ArrayList<>();


        User user1 = new User("Anna", 20, 2, new ArrayList<Violation>(), new ArrayList<Trip>());
        User user2 = new User("User2", 22, new ArrayList<Violation>(), new ArrayList<Trip>());
        User user3 = new User("User3", 1, new ArrayList<Violation>(), new ArrayList<Trip>());
        User user4 = new User("user number 4", 5, new ArrayList<Violation>(), new ArrayList<Trip>());

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.showAndDo(scanner, users);
        scanner.close();
    }
}