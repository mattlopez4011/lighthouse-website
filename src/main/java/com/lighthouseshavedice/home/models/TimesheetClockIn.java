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

    public TimesheetClockIn() {
    }

    public TimesheetClockIn(long id, String username, String name, String clockIn, User user_clock_in) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.clockIn = clockIn;
        this.user_clock_in = user_clock_in;
    }

    public TimesheetClockIn(String username, String name, String clockIn, User user_clock_in) {
        this.username = username;
        this.name = name;
        this.clockIn = clockIn;
        this.user_clock_in = user_clock_in;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClockIn() {
        return clockIn;
    }

    public void setClockIn(String clockIn) {
        this.clockIn = clockIn;
    }

    public User getUser_clock_in() {
        return user_clock_in;
    }

    public void setUser_clock_in(User user_clock_in) {
        this.user_clock_in = user_clock_in;
    }
}
