package com.luxoft.OOP;

import com.luxoft.collections.EnumExample;

import java.util.*;

public class Main {

    public static void main(String[] args){

        Plane plane = new Plane(300,2);
        plane.setFuel(300);
        plane.wings = 2;
        plane.fly(1000);

        new Incaps().pifagor(3,4);
        SuperJet superJet = new SuperJet(1200, 1);
        superJet.fly(500);

        new Cat().eat("fish");

        new Canon().reload();

    }
}
