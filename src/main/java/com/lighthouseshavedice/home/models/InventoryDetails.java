package com.lighthouseshavedice.home.models;

import javax.persistence.*;

@Entity
@Table(name = "inventory_details")
public class InventoryDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "VARCHAR(50)")
    private String updatedByName;

}
