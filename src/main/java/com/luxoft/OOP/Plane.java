package com.luxoft.OOP;

public class Plane {

    private int fuel;
    int wings;
    String engine;

    public Plane(int fuel, int wings) {
        this.fuel = fuel;
        this.wings = wings;
    }


    public void fly(int km){
        while(fuel>10){
            System.out.println("still flying");
            fuel = fuel - 100;
        }

    }

    public int getFuel(){
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
