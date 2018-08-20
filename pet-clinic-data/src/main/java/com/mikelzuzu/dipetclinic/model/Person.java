package com.mikelzuzu.dipetclinic.model;

public class Person extends BaseEntity{
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
