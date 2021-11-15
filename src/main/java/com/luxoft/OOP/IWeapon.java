package com.luxoft.OOP;

public interface IWeapon {

    void shoot();

    default void reload(){
        System.out.println("reloaded!");
    }
}
