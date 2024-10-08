package entity;


import backend.EmployeeOperations;

import java.util.*;

public class Laptop {
    EmployeeOperations ops = new EmployeeOperations();
    Scanner sc = new Scanner(System.in);

    private String brand;
    private String sNO;
    private int id;

    public Laptop() {
    }

    public Laptop(String brand, String sNO) {
        this.brand = brand;
        this.sNO = sNO;
        this.id=id;
    }

    public String getsNO() {
        return sNO;
    }

    public void setsNO(String sNO) {
        this.sNO = sNO;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", sNO='" + sNO + '\'' +
                '}';
    }
}
