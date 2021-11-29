package com.luxoft.generics;

public class GenClass<A extends Number> {
    //Convention - mark generic types as T, U or V for any data types
    // but use E for collections
    A value;

    public GenClass(A value) {
        this.value = value;
    }

    public A getValue(){
        return value;
    }


}
