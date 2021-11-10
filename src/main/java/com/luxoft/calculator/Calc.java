package com.luxoft.calculator;

public class Calc {

    public int sum(int a, int b){
        int result;
        if(b>a){
             result = a + b;
            System.out.println(++result);
        }else
            result = a - b;
        return result;
    }

    public void tern(int a){
        int b = (a>0) ? 0:a+1;
        System.out.println(b);
    }
}
