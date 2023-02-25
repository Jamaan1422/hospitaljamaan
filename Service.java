
package com.mycompany.sss;


public class Service implements ServiceClass {
  private String ID;
  private String name;
  private double price;
  private char type;

    public Service(String ID, String name,char type, double price) {
        this.ID = ID;
        this.name = name;
        this.type=type;
        this.price = price;
    }
public Service() {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
  
  public double totalPrice()
  {
      if(type=='A'||type=='a')
          return (price-0.40*price);
      else 
          return price;
          
  }
}