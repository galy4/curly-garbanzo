package com.luxoft.calculator;


import com.luxoft.calculator.Syntax;

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

//        printSomething("Good evening");
//        printSomething("sdfsdf");
        Syntax calc = new Syntax();
//        System.out.println(calc.sum(6,5));
//        calc.tern(-8);

//        calc.cond(3);
        calc.cycles();
    }

    private static void printSomething(String message){
        System.out.println(message);
    }
}
