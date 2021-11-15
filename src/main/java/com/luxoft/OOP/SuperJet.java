package com.luxoft.OOP;

public class SuperJet extends Plane{

    public SuperJet(int fuel, int wings) {
        super(fuel, wings);
    }

    @Override
    public void fly(int km){
        for(int i=10; i< km; i++){
            System.out.println("still flying");
        }
    }

    public void fly(long km){

    }
}
