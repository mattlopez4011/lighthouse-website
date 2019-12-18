package com.lighthouseshavedice.home.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "flavors_history")
public class FlavorHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "VARCHAR(50)")
    private String flavorName;
    @Column(columnDefinition = "VARCHAR(50)")
    private String createdByName;
    @Column(columnDefinition = "VARCHAR(50)")
    private String enteredByName;
    @Column(columnDefinition = "DATE")
    private String dateMade;
    @Column(columnDefinition = "DOUBLE")
    private String amtMadeQt;
    @Column(columnDefinition = "INT")
    private String amtMadeGal;

    //    Relationships with User table
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private User user;

    public FlavorHistory() {
    }

    public FlavorHistory(long id, String flavorName, String createdByName, String enteredByName, String dateMade, String amtMadeQt, String amtMadeGal) {
        this.id = id;
        this.flavorName = flavorName;
        this.createdByName = createdByName;
        this.enteredByName = enteredByName;
        this.dateMade = dateMade;
        this.amtMadeQt = amtMadeQt;
        this.amtMadeGal = amtMadeGal;
    }

    public FlavorHistory(String flavorName, String createdByName, String enteredByName, String dateMade, String amtMadeQt, String amtMadeGal, User user) {
        this.flavorName = flavorName;
        this.createdByName = createdByName;
        this.enteredByName = enteredByName;
        this.dateMade = dateMade;
        this.amtMadeQt = amtMadeQt;
        this.amtMadeGal = amtMadeGal;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    public String getEnteredByName() {
        return enteredByName;
    }

    public void setEnteredByName(String enteredByName) {
        this.enteredByName = enteredByName;
    }

    public String getDateMade() {
        return dateMade;
    }

    public void setDateMade(String dateMade) {
        this.dateMade = dateMade;
    }

    public String getAmtMadeQt() {
        return amtMadeQt;
    }

    public void setAmtMadeQt(String amtMadeQt) {
        this.amtMadeQt = amtMadeQt;
    }

    public String getAmtMadeGal() {
        return amtMadeGal;
    }

    public void setAmtMadeGal(String amtMadeGal) {
        this.amtMadeGal = amtMadeGal;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
