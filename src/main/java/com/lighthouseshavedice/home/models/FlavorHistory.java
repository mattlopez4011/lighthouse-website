package com.lighthouseshavedice.home.models;


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

    public FlavorHistory(String flavorName, String createdByName, String enteredByName, String dateMade, String amtMadeQt, String amtMadeGal) {
        this.flavorName = flavorName;
        this.createdByName = createdByName;
        this.enteredByName = enteredByName;
        this.dateMade = dateMade;
        this.amtMadeQt = amtMadeQt;
        this.amtMadeGal = amtMadeGal;
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
}
