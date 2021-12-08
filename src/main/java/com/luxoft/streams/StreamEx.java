package com.luxoft.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args){

        //Stream from collection
        List<String> covidStamms = new ArrayList<>();
        covidStamms.add("Alpha");
        covidStamms.add("Beta");
        covidStamms.add("Delta");
        covidStamms.add("Delta");
        covidStamms.add("Omikron");

        Stream<String> stream = covidStamms.stream();
        List<String> distinctList = stream.distinct().collect(Collectors.toList());
        distinctList.forEach(System.out::println);
        System.out.println("-----------------------------------");

        //Stream of entities
        Stream<String> stream1 = Stream.of("aa", "bb", "cc", "da", "aa", "bb", "cc");
        String str = stream1.distinct().filter(x->x.contains("a")).findAny().orElse("null");
        System.out.println(str);
        System.out.println("-----------------------------------");

        Assistant alice = new Assistant("Alice", 5);
        Assistant siri = new Assistant("Siri", 7);
        Assistant oleg = new Assistant("Oleg", 1);
        List<Assistant> assistantList = new ArrayList<>();
        assistantList.add(alice);
        assistantList.add(siri);
        assistantList.add(oleg);

        if(getSalut(assistantList).isPresent())
            System.out.println(getSalut(assistantList).get().getName());
        else
            System.out.println("null");
        System.out.println("-----------------------------------");
        //Stream of numbers
        IntStream strFromString = "5190".chars(); //stream contains ASCII codes

        int[] numbers = {4,8,0,-1,20,3,6,5};
        IntStream stream2 = Arrays.stream(numbers);

        int result = stream2.sorted().reduce((x1,x2)->x1+x2).orElseThrow(NullPointerException::new);
        System.out.println(result);
        IntStream stream3= Arrays.stream(numbers);
        int[] num2 = stream3.sorted().toArray();
        for(int i:num2)
            System.out.println(i);
        System.out.println("-----------------------------------");

        Stream<String> stream4 = covidStamms.stream();
        List<String> l1 = stream4.skip(2) //lazy
                .limit(2) // lazy
                .collect(Collectors.toList()); //eager

        l1.forEach(System.out::println);
        System.out.println("-----------------------------------");

        int[] num3 = strFromString.toArray();
        for(int i:num3)
            System.out.println(i);
        System.out.println("-----------------------------------");

        //Stream from file
        Stream<String> stream5 = null;
        try {
            stream5 = Files.lines(Paths.get("./src/main/resources/test.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        double[] num4 = stream5.mapToDouble(k->Double.parseDouble(k)).toArray();
        for(double i:num3)
            System.out.println(i);
        System.out.println("-----------------------------------");

        Stream<String> stream6 = covidStamms.parallelStream();
        Stream<Object> stream7 = Stream.builder()
                .add(alice)
                .add(siri)
                .add(new Assistant("salut", 0))
                .build();

        Stream<Integer> stream8 = Stream.iterate(2, x->2*x-1);
        List<Integer> f = stream8.limit(8).collect(Collectors.toList());
        f.forEach(System.out::println);

        Stream<String> stream9 = Stream.generate(()-> "value");
    }

    private static Optional<Assistant> getSalut(List<Assistant> assistantList){
        Optional<Assistant> salut = Optional.empty();
        for(Assistant assistant:assistantList){
            if(assistant.getName().equalsIgnoreCase("salut")){
                salut = Optional.of(assistant);
                break;
            }
        }
        return salut;
    }
}
