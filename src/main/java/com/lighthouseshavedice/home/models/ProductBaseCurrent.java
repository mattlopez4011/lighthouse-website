package com.lighthouseshavedice.home.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products_base_current")
public class ProductBaseCurrent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "VARCHAR(55)")
    private String product;
    @Column(columnDefinition = "VARCHAR(55)")
    private String brand;
    @Column(columnDefinition = "INT")
    private Integer qty;
    @Column(columnDefinition = "DECIMAL(15,2)")
    private BigDecimal cost;
    @Column(columnDefinition = "DECIMAL(15,2)")
    private BigDecimal each_unit_cost;

    //    Database Relationships
//    Connection with warehouse Table
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;

//    Empty Constructor
    public ProductBaseCurrent() {
    }

    public ProductBaseCurrent(long id, String product, String brand, Integer qty, BigDecimal cost, BigDecimal each_unit_cost, Warehouse warehouse) {
        this.id = id;
        this.product = product;
        this.brand = brand;
        this.qty = qty;
        this.cost = cost;
        this.each_unit_cost = each_unit_cost;
        this.warehouse = warehouse;
    }

    public ProductBaseCurrent(String product, String brand, Integer qty, BigDecimal cost, BigDecimal each_unit_cost, Warehouse warehouse) {
        this.product = product;
        this.brand = brand;
        this.qty = qty;
        this.cost = cost;
        this.each_unit_cost = each_unit_cost;
        this.warehouse = warehouse;
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

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
