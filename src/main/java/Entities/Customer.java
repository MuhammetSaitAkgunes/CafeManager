package Entities;

import Abstract.Entity;

public class Customer implements Entity {
    public int id;
    public String FirstName;
    public String LastName;
    public int dateOfBirth;
    public long nationalityNumber;

    public Customer(int id, String firstName, String lastName, int dateOfBirth, long nationalityNumber) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityNumber = nationalityNumber;
    }

    public Customer(int id, String FirstName, String LastName, int dateOfBirth) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getNationalityNumber() {
        return nationalityNumber;
    }

    public void setNationalityNumber(long nationalityNumber) {
        this.nationalityNumber = nationalityNumber;
    }
}
