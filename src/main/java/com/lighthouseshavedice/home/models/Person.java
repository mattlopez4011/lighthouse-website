package com.lighthouseshavedice.home.models;

public class Person {

    private int personId;
    private String name;
    private String country;

    public Person(){

    }

    public Person(int personId, String name, String country) {
        this.personId = personId;
        this.name = name;
        this.country = country;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
