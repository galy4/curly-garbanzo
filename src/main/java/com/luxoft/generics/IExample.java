package com.luxoft.generics;

public interface IExample {

    public void printSymbols();

    void sum(int a, int b);

    default int minus(int a, int b){
        return a-b;
    }
}
