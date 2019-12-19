package com.lighthouseshavedice.home.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "inventory_details")
public class InventoryDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "VARCHAR(50)")
    private String updatedByName;
    @Column(columnDefinition = "DATE")
    private String updatedTime;
    @Column(columnDefinition = "VARCHAR(50)")
    private String locationUpdated;


    //    Relationship with Users table
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private User user_inventDetails;

    public InventoryDetails() {
    }

    public InventoryDetails(long id, String updatedByName, String updatedTime, String locationUpdated, User user_inventDetails) {
        this.id = id;
        this.updatedByName = updatedByName;
        this.updatedTime = updatedTime;
        this.locationUpdated = locationUpdated;
        this.user_inventDetails = user_inventDetails;
    }

    public InventoryDetails(String updatedByName, String updatedTime, String locationUpdated, User user_inventDetails) {
        this.updatedByName = updatedByName;
        this.updatedTime = updatedTime;
        this.locationUpdated = locationUpdated;
        this.user_inventDetails = user_inventDetails;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUpdatedByName() {
        return updatedByName;
    }

    public void setUpdatedByName(String updatedByName) {
        this.updatedByName = updatedByName;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getLocationUpdated() {
        return locationUpdated;
    }

    public void setLocationUpdated(String locationUpdated) {
        this.locationUpdated = locationUpdated;
    }

    public User getUser_inventDetails() {
        return user_inventDetails;
    }

    public void setUser_inventDetails(User user_inventDetails) {
        this.user_inventDetails = user_inventDetails;
    }
}
