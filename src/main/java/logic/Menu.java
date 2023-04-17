package logic;

import entities.User;
import listControl.Adder;
import listControl.AllElementsShower;
import listControl.Deleter;
import listControl.ListEmptinessControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

@Service
public class Menu {
    @Autowired
    ListEmptinessControl listEmptinessControl;
    @Autowired
    Adder userAdder;
    @Autowired
    Deleter deleter;
    @Autowired
    AllElementsShower allElementsShower;
    @Autowired
    FinderByParameters finderByParameters;

    public void showMenu() {
        System.out.println("1 – add new user\n" + "2 – delete some user\n"
                + "3 – show all users\n" + "4 – find users by parameters\n" + "5 – exit\n");
    }


    public void showAndDo(Scanner scanner, List<User> users) throws ParseException {
        showMenu();
        //ListEmptinessControl listEmptinessControl = new ListEmptinessControl();
        int choice = scanner.nextInt();
        while (choice < 5) {
            switch (choice) {
                case (1):
                    //Adder userAdder = new Adder();
                    users.add(userAdder.addNewUser(scanner)); break;
                case (2):
                    if (!listEmptinessControl.isListEmpty(users)) {
                        //Deleter deleter = new Deleter();
                        deleter.deleteUser(scanner, users);
                    }
                    break;
                case (3):
                    if (!listEmptinessControl.isListEmpty(users)) {
                        //AllElementsShower allElementsShower = new AllElementsShower();
                        allElementsShower.showAllUsers(users);
                    }
                    break;
                case (4):
                    if (!listEmptinessControl.isListEmpty(users)) {
                        //FinderByParameters finderByParameters = new FinderByParameters();
                        finderByParameters.findByParameters(scanner, users);
                    }
                    break;
            }
            System.out.println("Anything else? y/n");
            if (scanner.next().equals("y")) {
                showMenu();
                choice = scanner.nextInt();
            }
            else choice = 5;
        }
    }
}
