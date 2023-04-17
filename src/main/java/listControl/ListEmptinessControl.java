package listControl;

import entities.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListEmptinessControl {
    public boolean isListEmpty(List<User> users) {
        if (users.isEmpty()) {
            System.out.println("No users in the list");
            return true;
        }
        else return false;
    }
}
