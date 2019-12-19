package com.lighthouseshavedice.home.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.jfr.Category;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "registers")
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "VARCHAR(50)")
    private String cashierName;
    @Column(columnDefinition = "VARCHAR(50)")
    private String paymentMethod;
    @Column(columnDefinition = "DATE")
    private String timeOfSale;
    @Column(columnDefinition = "FLOAT")
    private Float saleAmount;
    @Column(columnDefinition = "FLOAT")
    private Float taxAmount;
    @Column(columnDefinition = "FLOAT")
    private Float discountAmount;
    @Column(columnDefinition = "INT")
    private Integer itemsSold;

    //    Relationship with Users table
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private User user_register;

    public Register() {
    }

    public Register(long id, String cashierName, String paymentMethod, String timeOfSale, Float saleAmount, Float taxAmount, Float discountAmount, Integer itemsSold, User user_register) {
        this.id = id;
        this.cashierName = cashierName;
        this.paymentMethod = paymentMethod;
        this.timeOfSale = timeOfSale;
        this.saleAmount = saleAmount;
        this.taxAmount = taxAmount;
        this.discountAmount = discountAmount;
        this.itemsSold = itemsSold;
        this.user_register = user_register;
    }

    public Register(String cashierName, String paymentMethod, String timeOfSale, Float saleAmount, Float taxAmount, Float discountAmount, Integer itemsSold, User user_register) {
        this.cashierName = cashierName;
        this.paymentMethod = paymentMethod;
        this.timeOfSale = timeOfSale;
        this.saleAmount = saleAmount;
        this.taxAmount = taxAmount;
        this.discountAmount = discountAmount;
        this.itemsSold = itemsSold;
        this.user_register = user_register;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTimeOfSale() {
        return timeOfSale;
    }

    public void setTimeOfSale(String timeOfSale) {
        this.timeOfSale = timeOfSale;
    }

    public Float getSaleAmount() {
        return saleAmount;
    }

    public Float getTaxAmount() {
        return taxAmount;
    }

    public void setSaleAmount(Float saleAmount) {
        this.saleAmount = saleAmount;
    }

    public void setTaxAmount(Float taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Float getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Float discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Integer getItemsSold() {
        return itemsSold;
    }

    public void setItemsSold(Integer itemsSold) {
        this.itemsSold = itemsSold;
    }

    public User getUser_register() {
        return user_register;
    }

    public void setUser_register(User user_register) {
        this.user_register = user_register;
    }


}
