package com.lighthouseshavedice.home.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "VARCHAR(50)")
    private String flavor_name;
    @Column(columnDefinition = "VARCHAR(50)")
    private String cup_size;
    @Column(columnDefinition = "VARCHAR(50)")
    private String product_name;
    @Column(columnDefinition = "DECIMAL(15,2)")
    private String product_price;
    @Column(columnDefinition = "INT")
    private String qty;

    //    Relationship with register table
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "register_id")
    private Register register_sale;

    public Sale() {
    }

    public Sale(long id, String flavor_name, String cup_size, String product_name, String product_price, Register register_sale) {
        this.id = id;
        this.flavor_name = flavor_name;
        this.cup_size = cup_size;
        this.product_name = product_name;
        this.product_price = product_price;
        this.register_sale = register_sale;
    }

    public Sale(String flavor_name, String cup_size, String product_name, String product_price, String qty, Register register_sale) {
        this.flavor_name = flavor_name;
        this.cup_size = cup_size;
        this.product_name = product_name;
        this.product_price = product_price;
        this.qty = qty;
        this.register_sale = register_sale;
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

    public String getCup_size() {
        return cup_size;
    }

    public void setCup_size(String cup_size) {
        this.cup_size = cup_size;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public Register getRegister_sale() {
        return register_sale;
    }

    public void setRegister_sale(Register register_sale) {
        this.register_sale = register_sale;
    }
}
