package com.luxoft.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {


    public static void main(String[] args){
        int result=0;
        try (FileReader fr = new FileReader("~/work/test.txt")){
            result = 5 / 0;
        }catch(IndexOutOfBoundsException e){
            result = 5;
        }catch (ArithmeticException npe){
            result = 4;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(result);
        }
            method(4, null);

    }


    private static int method(int a, Integer b) throws NullPointerException{
        if(b!=null)
            return a+b;
        else
            throw new NullPointerException();
    }
}
