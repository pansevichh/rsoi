package entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


public class User {
    private String name;
    private int age;
    private long drivingExperience;
    private List<Violation> violations;
    private List<Trip> tripsHistory;
    private static final AtomicLong count = new AtomicLong(0); //автоматически генерировать
    private final long id = count.incrementAndGet();

    public User(String name, int age, long drivingExperience, List<Violation> violations, List<Trip> tripsHistory) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
        this.violations = violations;
        this.tripsHistory = tripsHistory;
    }

    public User(String name, long drivingExperience, List<Violation> violations, List<Trip> tripsHistory) {
        this.name = name;
        this.drivingExperience = drivingExperience;
        this.violations = violations;
        this.tripsHistory = tripsHistory;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(long drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public List<Violation> getviolations() {
        return violations;
    }

    public void setviolations(List<Violation> violations) {
        this.violations = violations;
    }

    public List<Trip> gettripsHistory() {
        return tripsHistory;
    }

    public void settripsHistory(List<Trip> tripsHistory) {
        this.tripsHistory = tripsHistory;
    }

    public long getId() {
        return id;
    }

    @Bean
    public void printUserInfo(User user) {
            System.out.println("Id:  " + user.getId());
            System.out.println("Name:  " + user.getName());
            if (user.getAge() == 0) {
                System.out.println("Age:  no info");
            }
            else {
                System.out.println("Age:  " + user.getAge());
            }
            System.out.println("Experience (years):  " + user.getDrivingExperience());
            if (user.getviolations().isEmpty()) {
                System.out.println("No violations added");
            }
            else {
                System.out.println("Violations:");
                for (Violation v : user.violations) {
                    System.out.println(v.getDateOfViolation() + "  " + v.getContent());
                }
            }
            if (user.gettripsHistory().isEmpty()) {
                System.out.println("No trips yet");
            }
            else {
                System.out.println("Trips:  ");
                for (Trip t : user.tripsHistory) {
                    System.out.println(t.getDateOfTrip() + "  " + t.getPriceOfTrip());
                }
            }
    }

}