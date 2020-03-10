package com.lighthouseshavedice.home.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products_store_current")
public class ProductStoreCurrent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "VARCHAR(50)")
    private String product;
    @Column(columnDefinition = "VARCHAR(50)")
    private String brand;
    @Column(columnDefinition = "INT")
    private Integer qty;
    @Column(columnDefinition = "DECIMAL(15,2)")
    private BigDecimal cost;
    @Column(columnDefinition = "DECIMAL(15,2)")
    private BigDecimal each_unit_cost;

//    Database Relationships
//    Connection with store_locations Table
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "store_location_id")
    private StoreLocation storeLocation;

    public ProductStoreCurrent() {
    }

    public ProductStoreCurrent(long id, String product, String brand, Integer qty, BigDecimal cost, BigDecimal each_unit_cost, StoreLocation storeLocation) {
        this.id = id;
        this.product = product;
        this.brand = brand;
        this.qty = qty;
        this.cost = cost;
        this.each_unit_cost = each_unit_cost;
        this.storeLocation = storeLocation;
    }

    public ProductStoreCurrent(String product, String brand, Integer qty, BigDecimal cost, BigDecimal each_unit_cost, StoreLocation storeLocation) {
        this.product = product;
        this.brand = brand;
        this.qty = qty;
        this.cost = cost;
        this.each_unit_cost = each_unit_cost;
        this.storeLocation = storeLocation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getEach_unit_cost() {
        return each_unit_cost;
    }

    public void setEach_unit_cost(BigDecimal each_unit_cost) {
        this.each_unit_cost = each_unit_cost;
    }

    public StoreLocation getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(StoreLocation storeLocation) {
        this.storeLocation = storeLocation;
    }
}
