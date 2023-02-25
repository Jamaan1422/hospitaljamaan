
package com.mycompany.sss;


public class Employee {
       private String ID;
       private String name;
       private String address; 
       private String mobileNumber;
       private String email ;
       private double salary; 

    public Employee(String ID, String name, String address, String mobileNumber, String email, double salary) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.salary = salary;
    }
 public Employee() {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "ID=" + ID + ", name=" + name + ", address=" + address + ", mobileNumber=" + mobileNumber + ", email=" + email + ", salary=" + salary ;
    }
     
    }
