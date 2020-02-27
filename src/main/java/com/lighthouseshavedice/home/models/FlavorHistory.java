package com.lighthouseshavedice.home.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

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
    private Date dateMade;
    @Column(columnDefinition = "DOUBLE")
    private Double amtMadeQt;
    @Column(columnDefinition = "INT")
    private Integer amtMadeGal;

    //    Database Relationships
    //    Relationships with warehouse table
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;
    // Relationships with User
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private User user_flavorHistory;

    public FlavorHistory() {
    }

    public FlavorHistory(long id, String flavorName, String createdByName, String enteredByName, Date dateMade, Double amtMadeQt, Integer amtMadeGal, Warehouse warehouse, User user_flavorHistory) {
        this.id = id;
        this.flavorName = flavorName;
        this.createdByName = createdByName;
        this.enteredByName = enteredByName;
        this.dateMade = dateMade;
        this.amtMadeQt = amtMadeQt;
        this.amtMadeGal = amtMadeGal;
        this.warehouse = warehouse;
        this.user_flavorHistory = user_flavorHistory;
    }

    public FlavorHistory(String flavorName, String createdByName, String enteredByName, Date dateMade, Double amtMadeQt, Integer amtMadeGal, Warehouse warehouse, User user_flavorHistory) {
        this.flavorName = flavorName;
        this.createdByName = createdByName;
        this.enteredByName = enteredByName;
        this.dateMade = dateMade;
        this.amtMadeQt = amtMadeQt;
        this.amtMadeGal = amtMadeGal;
        this.warehouse = warehouse;
        this.user_flavorHistory = user_flavorHistory;
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

    public Date getDateMade() {
        return dateMade;
    }

    public void setDateMade(Date dateMade) {
        this.dateMade = dateMade;
    }

    public Double getAmtMadeQt() {
        return amtMadeQt;
    }

    public void setAmtMadeQt(Double amtMadeQt) {
        this.amtMadeQt = amtMadeQt;
    }

    public Integer getAmtMadeGal() {
        return amtMadeGal;
    }

    public void setAmtMadeGal(Integer amtMadeGal) {
        this.amtMadeGal = amtMadeGal;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public User getUser_flavorHistory() {
        return user_flavorHistory;
    }

    public void setUser_flavorHistory(User user_flavorHistory) {
        this.user_flavorHistory = user_flavorHistory;
    }
}
