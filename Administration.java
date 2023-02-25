
package com.mycompany.sss;


public class Administration extends Employee {
   

    private String position;

    public Administration() {
    }

    public Administration(String position, String ID, String name, String address, String mobileNumber, String email, double salary) {
        super(ID, name, address, mobileNumber, email, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}


