package additional;
import entities.Trip;
import entities.User;
import entities.Violation;

import java.util.List;
import java.util.Scanner;

public interface ConsoleInput {

    public void inputData(Scanner scanner, User user, List<Violation> violationList, List<Trip> tripsHistory);
}
