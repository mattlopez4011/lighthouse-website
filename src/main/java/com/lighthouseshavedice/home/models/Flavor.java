package com.lighthouseshavedice.home.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "flavors")
public class Flavor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String flavor_name;
    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String flavor_color;
    @Column(columnDefinition = "DOUBLE NOT NULL ")
    private Double flavor_amt_qt;
    @Column(columnDefinition = "INT NOT NULL ")
    private Integer flavor_amt_gal;
    @Column(columnDefinition = "DATE")
    private String date_created;
    @Column(columnDefinition = "VARCHAR(255)")
    private String created_by_name;
    @Column(columnDefinition = "VARCHAR(255)")
    private String delivered_by_name;
    @Column(columnDefinition = "INT")
    private Integer days_stored;
    @Column(columnDefinition = "BOOLEAN")
    private Boolean is_regular_flavor;
    @Column(columnDefinition = "BOOLEAN")
    private Boolean is_specialty_flavor;

    //    Relationships with Location table
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "store_location_id")
    private StoreLocation location;

    //    Empty Constructor
    public Flavor() {
    }git st

    public Flavor(long id, String flavor_name, String flavor_color, Double flavor_amt_qt, Integer flavor_amt_gal, String date_created, String created_by_name, String delivered_by_name, Integer days_stored, Boolean is_regular_flavor, Boolean is_specialty_flavor, StoreLocation location) {
        this.id = id;
        this.flavor_name = flavor_name;
        this.flavor_color = flavor_color;
        this.flavor_amt_qt = flavor_amt_qt;
        this.flavor_amt_gal = flavor_amt_gal;
        this.date_created = date_created;
        this.created_by_name = created_by_name;
        this.delivered_by_name = delivered_by_name;
        this.days_stored = days_stored;
        this.is_regular_flavor = is_regular_flavor;
        this.is_specialty_flavor = is_specialty_flavor;
        this.location = location;
    }

    public Flavor(String flavor_name, String flavor_color, Double flavor_amt_qt, Integer flavor_amt_gal, String date_created, String created_by_name, String delivered_by_name, Integer days_stored, Boolean is_regular_flavor, Boolean is_specialty_flavor, StoreLocation location) {
        this.flavor_name = flavor_name;
        this.flavor_color = flavor_color;
        this.flavor_amt_qt = flavor_amt_qt;
        this.flavor_amt_gal = flavor_amt_gal;
        this.date_created = date_created;
        this.created_by_name = created_by_name;
        this.delivered_by_name = delivered_by_name;
        this.days_stored = days_stored;
        this.is_regular_flavor = is_regular_flavor;
        this.is_specialty_flavor = is_specialty_flavor;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFlavor_name() {
        return flavor_name;
    }

    public void setFlavor_name(String flavor_name) {
        this.flavor_name = flavor_name;
    }

    public String getFlavor_color() {
        return flavor_color;
    }

    public void setFlavor_color(String flavor_color) {
        this.flavor_color = flavor_color;
    }

    public Double getFlavor_amt_qt() {
        return flavor_amt_qt;
    }

    public void setFlavor_amt_qt(Double flavor_amt_qt) {
        this.flavor_amt_qt = flavor_amt_qt;
    }

    public Integer getFlavor_amt_gal() {
        return flavor_amt_gal;
    }

    public void setFlavor_amt_gal(Integer flavor_amt_gal) {
        this.flavor_amt_gal = flavor_amt_gal;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getCreated_by_name() {
        return created_by_name;
    }

    public void setCreated_by_name(String created_by_name) {
        this.created_by_name = created_by_name;
    }

    public String getDelivered_by_name() {
        return delivered_by_name;
    }

    public void setDelivered_by_name(String delivered_by_name) {
        this.delivered_by_name = delivered_by_name;
    }

    public Integer getDays_stored() {
        return days_stored;
    }

    public void setDays_stored(Integer days_stored) {
        this.days_stored = days_stored;
    }

    public Boolean getIs_regular_flavor() {
        return is_regular_flavor;
    }

    public void setIs_regular_flavor(Boolean is_regular_flavor) {
        this.is_regular_flavor = is_regular_flavor;
    }

    public Boolean getIs_specialty_flavor() {
        return is_specialty_flavor;
    }

    public void setIs_specialty_flavor(Boolean is_specialty_flavor) {
        this.is_specialty_flavor = is_specialty_flavor;
    }

    public StoreLocation getLocation() {
        return location;
    }

    public void setLocation(StoreLocation location) {
        this.location = location;
    }
}
