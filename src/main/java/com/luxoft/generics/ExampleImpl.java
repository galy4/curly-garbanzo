package com.luxoft.generics;

import java.util.List;

public class ExampleImpl implements IExample {

    @Override
    public void printSymbols() {
        System.out.println("some symbols");
    }

    @Override
    public void sum(int a, int b) {
        System.out.println(a+b);
    }
}
