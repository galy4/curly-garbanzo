package com.luxoft.generics;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyClass {

    public static void main(String[] args){

        int int1 = 8;
        double double1 = int1;
        System.out.println(double1);
        short short1 = (short) double1;
        System.out.println(short1);
        long long1 = (long)int1;

        List list = new ArrayList();
        list.add("azaza");
        list.add(10);
        list.add(new MyClass());


        GenClass<Float> genClass = new GenClass<>(144F);
        genClass.getValue();
        System.out.println(genClass.value);

        ExampleImpl example = new ExampleImpl();
        example.sum(1,2);
        example.minus(5,3);

        IExample example1 = new ExampleImpl();

        printArr(1,3,5,8,7);
        printArr(2);


    }
    public static void printArr(Integer... args){
        List<Integer> list = Arrays.asList(args);
        for(Integer val:list)
            System.out.println(val);
    }
}
