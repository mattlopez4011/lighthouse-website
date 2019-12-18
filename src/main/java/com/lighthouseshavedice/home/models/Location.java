package com.lighthouseshavedice.home.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "VARCHAR(50)")
    private String location_name;
    @Column(columnDefinition = "VARCHAR(255)")
    private String location_address;

//    Relationship with Flavors table
    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<Flavors> flavors;

    public Location() {
    }

    public Location(long id, String location_name, String location_address, List<Flavors> flavors) {
        this.id = id;
        this.location_name = location_name;
        this.location_address = location_address;
        this.flavors = flavors;
    }

    public Location(String location_name, String location_address, List<Flavors> flavors) {
        this.location_name = location_name;
        this.location_address = location_address;
        this.flavors = flavors;
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

    public List<Flavors> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<Flavors> flavors) {
        this.flavors = flavors;
    }
}
