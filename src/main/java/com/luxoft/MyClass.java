package com.luxoft;


import com.luxoft.calculator.Calc;

public class MyClass {

    //random text
    /*
    sld;jf;lsdjkf;l
    sdkjlhsdf
    slkdjglksjdf
     */

    /**
     * Created by
     * @param args - start arguments
     */
    public static void main(String[] args){

        printSomething("Good evening");
        printSomething("sdfsdf");
        Calc calc = new Calc();
        System.out.println(calc.sum(6,5));
        calc.tern(-8);
    }

    private static void printSomething(String message){
        System.out.println(message);
    }
}
