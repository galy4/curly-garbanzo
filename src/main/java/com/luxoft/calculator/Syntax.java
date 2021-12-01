package com.luxoft.calculator;

import java.util.Arrays;
import java.util.List;

public class Syntax {

    int anInt;
    long aLong = 10L;
    float aFloat = 10.5F;
    double aDouble = 20.89D;
    char aChar = 'g';
    boolean aBoolean = true;


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


    public int cond(int a){
        int b = 5;
        switch(a) {
            case 4:
                b = b+b; break;
            case 2:
                b = b-b; break;
            case 3:
                b=b*b*b*b; break;
            default:
                b =0;
        }
        return b;
    }

    @Deprecated
    public void cycles(){
        int k=0;
//        while (k<4){
//            System.out.println("k still less than 4");
//            k++;
//        }

//        do{
//            System.out.println("k still less than 4");
//            k++;
//        }while (k<4);

        List<String> names = Arrays.asList( "Mary", "Kate", "Eshley");
        int e=0;
        for(int j=0; j<names.size(); j++){
            if(names.get(j).contains("e")) {
                e++;
                break;
            }
        }
        System.out.println(e);

        for(String val : names){
            if(val.contains("e")) {
                e++;
            }else
                continue;
        }
        System.out.println(e);

    }
}
