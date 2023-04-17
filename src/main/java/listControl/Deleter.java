package listControl;

import entities.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Scanner;

@Configuration
public class Deleter {
    @Bean
    public void deleteUser(Scanner scanner, List<User> users){
        System.out.println("Now there are  " + users.size() + "  users");
        System.out.println("Enter the name of the user you want to delete:");
        String nameToDelete = scanner.next();
        users.removeIf(n -> (n.getName().equals(nameToDelete)));
        System.out.println("Now  " + users.size() + "  users available");
    }
}
