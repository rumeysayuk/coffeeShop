package Entities;

import Abstract.Entity;

import java.time.LocalDate;
import java.util.Date;

public class Customer implements Entity {
    private int id ;
    private String nationalityId;
    private String firstName ;
    private String lastName ;
    private LocalDate dateOfBirth ;

    public Customer(int id,String nationalityId,String firstName,String lastName,LocalDate dateOfBirth) {
        this.setId(id);
        this.setNationalityId(nationalityId);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setDateOfBirth(dateOfBirth);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth=dateOfBirth;
    }
}
