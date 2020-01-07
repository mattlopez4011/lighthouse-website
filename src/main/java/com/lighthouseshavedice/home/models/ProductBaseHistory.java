package com.lighthouseshavedice.home.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

@Entity
@Table(name = "products_base_history")
public class ProductBaseHistory {
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
    @Column(columnDefinition = "DATE")
    private Date purchased_date;
    @Column(columnDefinition = "INT")
    private Integer total_units_qty;
    @Column(columnDefinition = "VARCHAR(50)")
    private String entered_by_name;

    //    Database Relationships
//    Connection with warehouse Table
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;

//    Empty Constructor
    public ProductBaseHistory() {
    }

    public ProductBaseHistory(long id, String product, String brand, Integer qty, BigDecimal cost, Date purchased_date, Integer total_units_qty, String entered_by_name, Warehouse warehouse) {
        this.id = id;
        this.product = product;
        this.brand = brand;
        this.qty = qty;
        this.cost = cost;
        this.purchased_date = purchased_date;
        this.total_units_qty = total_units_qty;
        this.entered_by_name = entered_by_name;
        this.warehouse = warehouse;
    }

    public ProductBaseHistory(String product, String brand, Integer qty, BigDecimal cost, Date purchased_date, Integer total_units_qty, String entered_by_name, Warehouse warehouse) {
        this.product = product;
        this.brand = brand;
        this.qty = qty;
        this.cost = cost;
        this.purchased_date = purchased_date;
        this.total_units_qty = total_units_qty;
        this.entered_by_name = entered_by_name;
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

    public Date getPurchased_date() {
        return purchased_date;
    }

    public void setPurchased_date(Date purchased_date) {
        this.purchased_date = purchased_date;
    }

    public Integer getTotal_units_qty() {
        return total_units_qty;
    }

    public void setTotal_units_qty(Integer total_units_qty) {
        this.total_units_qty = total_units_qty;
    }

    public String getEntered_by_name() {
        return entered_by_name;
    }

    public void setEntered_by_name(String entered_by_name) {
        this.entered_by_name = entered_by_name;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
