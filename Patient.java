
package com.mycompany.sss;

import java.util.Vector;

public class Patient {

    private String ID;
    private String name;
    private String address;
    private String mobileNumber;
    private String email;
    Vector<Service> services;
    private Doctor doctor;

    public Patient(String ID, String name, String address, String mobileNumber, String email) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.email = email;
        services = new Vector<Service>();
    }

    public Patient() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void addService(Service s) {
        this.services.add(s);
    }

    @Override
    public String toString() {
        return "\nID=" + ID + "\nname=" + name + ", address=" + address + ", mobileNumber=" + mobileNumber + ", email=" + email;
    }

}