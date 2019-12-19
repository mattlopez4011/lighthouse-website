package com.lighthouseshavedice.home.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "timesheet_clock_out")
public class TimesheetClockOut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "VARCHAR(50)")
    private String username;
    @Column(columnDefinition = "VARCHAR(50)")
    private String name;
    @Column(columnDefinition = "DATE")
    private String clockOut;

    //    Relationship with Users table
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private User user_clock_out;

    public TimesheetClockOut() {
    }

    public TimesheetClockOut(long id, String username, String name, String clockOut, User user_clock_out) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.clockOut = clockOut;
        this.user_clock_out = user_clock_out;
    }

    public TimesheetClockOut(String username, String name, String clockOut, User user_clock_out) {
        this.username = username;
        this.name = name;
        this.clockOut = clockOut;
        this.user_clock_out = user_clock_out;
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

    public String getClockOut() {
        return clockOut;
    }

    public void setClockOut(String clockOut) {
        this.clockOut = clockOut;
    }

    public User getUser_clock_out() {
        return user_clock_out;
    }

    public void setUser_clock_out(User user_clock_out) {
        this.user_clock_out = user_clock_out;
    }
}
