package com.lighthouseshavedice.home.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "store_locations")
public class StoreLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "VARCHAR(50)")
    private String location_name;
    @Column(columnDefinition = "VARCHAR(255)")
    private String location_address;

//    Relationship with Flavors table
    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<Flavor> flavors;
    //    Relationship with Users table
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private User user_loc;
    //    Relationship with locations table
    @OneToMany(mappedBy = "user_loc", cascade = CascadeType.ALL)
    private List<StoreLocation> locations;
    //    Relationship with registers table
    @OneToMany(mappedBy = "location_register", cascade = CascadeType.ALL)
    private List<Register> registers;

    public StoreLocation() {
    }

    public StoreLocation(long id, String location_name, String location_address, List<Flavor> flavors, User user_loc, List<StoreLocation> locations, List<Register> registers) {
        this.id = id;
        this.location_name = location_name;
        this.location_address = location_address;
        this.flavors = flavors;
        this.user_loc = user_loc;
        this.locations = locations;
        this.registers = registers;
    }

    public StoreLocation(String location_name, String location_address, List<Flavor> flavors, User user_loc, List<StoreLocation> locations, List<Register> registers) {
        this.location_name = location_name;
        this.location_address = location_address;
        this.flavors = flavors;
        this.user_loc = user_loc;
        this.locations = locations;
        this.registers = registers;
    }


    //=============== Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public String getLocation_address() {
        return location_address;
    }

    public void setLocation_address(String location_address) {
        this.location_address = location_address;
    }

    public List<Flavor> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<Flavor> flavors) {
        this.flavors = flavors;
    }

    public User getUser_loc() {
        return user_loc;
    }

    public void setUser_loc(User user_loc) {
        this.user_loc = user_loc;
    }

    public List<StoreLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<StoreLocation> locations) {
        this.locations = locations;
    }

    public List<Register> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register> registers) {
        this.registers = registers;
    }
}
