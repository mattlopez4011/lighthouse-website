package com.lighthouseshavedice.home.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "VARCHAR(255) NOT NULL UNIQUE")
    private String name;
    @Column(columnDefinition = "VARCHAR(255) NOT NULL UNIQUE")
    private String username;
    @Column(columnDefinition = "VARCHAR(255) NOT NULL UNIQUE")
    private String password;
    @Column(columnDefinition = "VARCHAR(15) NOT NULL UNIQUE")
    private String phone_number;
    @Column(columnDefinition = "VARCHAR(15) NOT NULL")
    private String gender;
    @Column(columnDefinition = "VARCHAR(255)")
    private String profile_pic;
    @Column(columnDefinition = "VARCHAR(255)")
    private String last_login;
    @Column(columnDefinition = "VARCHAR(255)")
    private String date_created;
    @Column(columnDefinition = "BOOLEAN")
    private Boolean is_admin;

            //    Relationship with flavors table
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Flavor> flavors;
    //    Relationship with flavors_history table
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<FlavorHistory> flavorsHistory;
    //    Relationship with locations table
    @OneToMany(mappedBy = "user_loc", cascade = CascadeType.ALL)
    private List<StoreLocation> locations;
    //    Relationship with inventory_details table
    @OneToMany(mappedBy = "user_inventDetails", cascade = CascadeType.ALL)
    private List<InventoryDetails> inventoryDetails;
    //    Relationship with timesheet_clock_in table
    @OneToMany(mappedBy = "user_clock_in", cascade = CascadeType.ALL)
    private List<TimesheetClockIn> timesheetClockIn;
    //    Relationship with register table
    @OneToMany(mappedBy = "user_register", cascade = CascadeType.ALL)
    private List<Register> registers;


    public User() {
    }

    //This is for spring security
    public User(User copy){
        id = copy.id;
        username = copy.username;
        password = copy.password;

    }

    public User(long id, String name, String phone_number, String gender, String profile_pic, String last_login, String date_created, Boolean is_admin, List<Flavor> flavors, List<FlavorHistory> flavorsHistory, List<StoreLocation> locations, List<InventoryDetails> inventoryDetails, List<TimesheetClockIn> timesheetClockIn, List<Register> registers) {
        this.id = id;
        this.name = name;
        this.phone_number = phone_number;
        this.gender = gender;
        this.profile_pic = profile_pic;
        this.last_login = last_login;
        this.date_created = date_created;
        this.is_admin = is_admin;
        this.flavors = flavors;
        this.flavorsHistory = flavorsHistory;
        this.locations = locations;
        this.inventoryDetails = inventoryDetails;
        this.timesheetClockIn = timesheetClockIn;
        this.registers = registers;
    }

    public User(String name, String username, String password, String phone_number, String gender, String profile_pic, String last_login, String date_created, Boolean is_admin, List<Flavor> flavors, List<FlavorHistory> flavorsHistory, List<StoreLocation> locations, List<InventoryDetails> inventoryDetails, List<TimesheetClockIn> timesheetClockIn, List<Register> registers) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.phone_number = phone_number;
        this.gender = gender;
        this.profile_pic = profile_pic;
        this.last_login = last_login;
        this.date_created = date_created;
        this.is_admin = is_admin;
        this.flavors = flavors;
        this.flavorsHistory = flavorsHistory;
        this.locations = locations;
        this.inventoryDetails = inventoryDetails;
        this.timesheetClockIn = timesheetClockIn;
        this.registers = registers;
    }

    //    Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getLast_login() {
        return last_login;
    }

    public void setLast_login(String last_login) {
        this.last_login = last_login;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public Boolean getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(Boolean is_admin) {
        this.is_admin = is_admin;
    }

    public List<Flavor> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<Flavor> flavors) {
        this.flavors = flavors;
    }

    public List<FlavorHistory> getFlavorsHistory() {
        return flavorsHistory;
    }

    public void setFlavorsHistory(List<FlavorHistory> flavorsHistory) {
        this.flavorsHistory = flavorsHistory;
    }

    public List<StoreLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<StoreLocation> locations) {
        this.locations = locations;
    }

    public List<InventoryDetails> getInventoryDetails() {
        return inventoryDetails;
    }

    public void setInventoryDetails(List<InventoryDetails> inventoryDetails) {
        this.inventoryDetails = inventoryDetails;
    }

    public List<TimesheetClockIn> getTimesheetClockIn() {
        return timesheetClockIn;
    }

    public void setTimesheetClockIn(List<TimesheetClockIn> timesheetClockIn) {
        this.timesheetClockIn = timesheetClockIn;
    }

    public List<Register> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register> registers) {
        this.registers = registers;
    }
}
