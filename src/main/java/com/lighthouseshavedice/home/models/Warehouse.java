package com.lighthouseshavedice.home.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "warehouse")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "VARCHAR(50)")
    private String warehouse_name;
    @Column(columnDefinition = "VARCHAR(50)")
    private String warehouse_address;

//    Database Relationships
//    Connection with products_base_history Table
    @OneToMany(mappedBy = "product_base_history", cascade = CascadeType.ALL)
    private List<ProductBaseHistory> product_base_histories;
    //    Connection with products_base_current Table
    @OneToMany(mappedBy = "products_base_current", cascade = CascadeType.ALL)
    private List<ProductBaseCurrent> product_base_currents;
    //    Connection with flavor_history Table
    @OneToMany(mappedBy = "flavors_history", cascade = CascadeType.ALL)
    private List<FlavorHistory> flavorHistories;

    public Warehouse() {
    }

    public Warehouse(long id, String warehouse_name, String warehouse_address, List<ProductBaseHistory> product_base_histories, List<ProductBaseCurrent> product_base_currents, List<FlavorHistory> flavorHistories) {
        this.id = id;
        this.warehouse_name = warehouse_name;
        this.warehouse_address = warehouse_address;
        this.product_base_histories = product_base_histories;
        this.product_base_currents = product_base_currents;
        this.flavorHistories = flavorHistories;
    }

    public Warehouse(String warehouse_name, String warehouse_address, List<ProductBaseHistory> product_base_histories, List<ProductBaseCurrent> product_base_currents, List<FlavorHistory> flavorHistories) {
        this.warehouse_name = warehouse_name;
        this.warehouse_address = warehouse_address;
        this.product_base_histories = product_base_histories;
        this.product_base_currents = product_base_currents;
        this.flavorHistories = flavorHistories;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public String getWarehouse_address() {
        return warehouse_address;
    }

    public void setWarehouse_address(String warehouse_address) {
        this.warehouse_address = warehouse_address;
    }

    public List<ProductBaseHistory> getProduct_base_histories() {
        return product_base_histories;
    }

    public void setProduct_base_histories(List<ProductBaseHistory> product_base_histories) {
        this.product_base_histories = product_base_histories;
    }

    public List<ProductBaseCurrent> getProduct_base_currents() {
        return product_base_currents;
    }

    public void setProduct_base_currents(List<ProductBaseCurrent> product_base_currents) {
        this.product_base_currents = product_base_currents;
    }

    public List<FlavorHistory> getFlavorHistories() {
        return flavorHistories;
    }

    public void setFlavorHistories(List<FlavorHistory> flavorHistories) {
        this.flavorHistories = flavorHistories;
    }
}
