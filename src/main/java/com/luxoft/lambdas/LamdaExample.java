package com.luxoft.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.*;

public class LamdaExample {

    public static void main(String[] args){
        final List<String> stringList = new ArrayList<>();
        stringList.add("John");
        stringList.add("Alice");
        stringList.add("Kate");

        MyClass ma = new MyClass();
        ma.count(3,4);

        Triangle square = (int a, int b) -> {
//            System.out.println(a);
            return a * b/ 2;
        };
        System.out.println(square.count(3,4));

        Triangle hyp = (a,b) -> (int)Math.sqrt(a*a+b*b);
        System.out.println(hyp.count(3,4));

        //Effectively final
        int c = 1;
        Substraction substraction = (i,k) -> i-k+c;
        System.out.println(substraction.minus(5,2));

        Runnable runnable = ()-> System.out.println("Hello!");
        runnable.run();

        Printer printer = s -> System.out.println("Hello, " + s);
        printer.hello("class");


        Predicate<Integer> p = (x) -> x>0;

        if(p.test(10))
            System.out.println("10");
        else
            System.out.println("-10");


        Consumer<String> consumer = (s)->{
            String s1 = s.replaceAll(" ", "");
            System.out.println(s1);
        };

        consumer.accept("Hello world");


        Supplier<User> userSupplier = () ->{
            Scanner input = new Scanner(System.in);
            System.out.println("enter da name:");
            String name = input.nextLine();
            return new User(name);
        };

        User user1 = userSupplier.get();

        BinaryOperator<String> b = (s3,s4) -> s3+s4;
        System.out.println(b.apply("Hello", "_World"));

        UnaryOperator<String> u = s5 -> s5.replaceAll(" ", "");
        System.out.println(u.apply(" Alpha Beta Gamma"));

        Function<String,String> f = Editor::removeSpaces;
        System.out.println(f.apply(" Alpha Beta Gamma"));

        stringList.forEach(System.out::println);
    }


    interface Substraction{
        int minus(int i, int k);
    }

    interface Printer{
        void hello(String s);
    }
}
