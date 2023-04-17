package listControl;

import entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllElementsShower {
    public void showAllUsers(List<User> users) {
        for (User n : users) {
            n.printUserInfo(n);
            System.out.println();
        }
    }
}
