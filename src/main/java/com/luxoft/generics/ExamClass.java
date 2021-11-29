package com.luxoft.generics;

public class ExamClass {


    public <U> U sum(Integer int1, Class<U> u){
        //somecode
        return (U)u;
    }
}
