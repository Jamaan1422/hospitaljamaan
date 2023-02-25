
package com.mycompany.sss;


import java.util.Vector;

public class Doctor extends Employee {

    private String rank;
    private String specialty;
    private Vector<Patient> patients;
    private Vector<Service> services;

    public Doctor(String rank, String specialty, String ID, String name, String address, String mobileNumber, String email, double salary) {
        super(ID, name, address, mobileNumber, email, salary);
        this.rank = rank;
        this.specialty = specialty;
        patients = new Vector< Patient>();
        services = new Vector<Service>();
    }

    public Doctor() {
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void addPatient(Patient p) {
        this.patients.add(p);
    }

    public void addService(Service s) {
        this.services.add(s);
    }

    @Override
    public String toString() {
        return super.toString() + "rank=" + rank + ", specialty=" + specialty;
    }

}
