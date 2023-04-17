package entities;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

public class Violation {
    private String content;
    private LocalDate dateOfViolation;

    public Violation(String content, LocalDate dateOfViolation) {
        this.content = content;
        this.dateOfViolation = dateOfViolation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDateOfViolation() {
        return dateOfViolation;
    }

    public void setDateOfViolation(LocalDate dateOfViolation) {
        this.dateOfViolation = dateOfViolation;
    }
}
