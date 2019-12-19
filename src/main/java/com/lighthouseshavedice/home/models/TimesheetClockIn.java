package com.lighthouseshavedice.home.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "timesheet_clock_in")
public class TimesheetClockIn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "VARCHAR(50)")
    private String username;
    @Column(columnDefinition = "VARCHAR(50)")
    private String name;
    @Column(columnDefinition = "DATE")
    private String clockIn;

    //    Relationship with Users table
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private User user_clock_in;


}
