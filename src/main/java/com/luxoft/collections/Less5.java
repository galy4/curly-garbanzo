package com.luxoft.collections;

import java.util.*;

public class Less5 {

    public static void main(String[] args){

        Map<String,Integer> map = new HashMap<>();
        map.put("Sergio", 15);
        map.put("Kelly", 22);
        map.put("Alice", Integer.parseInt("6"));
        map.put("John", 22);
        map.remove("John");
        map.replace("Sergio", 20);
        map.replace("Kelly", 22, 50);

        System.out.println(map.containsKey("Kelly"));
        System.out.println(map.containsValue(6));

        System.out.println(map.get("Alice"));
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        System.out.println(set);

        System.out.println(map.getOrDefault("Pete", -1));
        System.out.println(map.keySet());

        //count symbols in input string
        String str = "aaebbdcc";
        Map<Character, Integer> charMap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(charMap.putIfAbsent(str.charAt(i), 1)!=null)
                charMap.put(str.charAt(i), charMap.get(str.charAt(i)) + 1);
        }
        System.out.println(charMap);

        //---------------
        
        Map<Integer,Integer> map1 = new HashMap<>();
        Integer[] arr = {2,3,5};
        for(Integer x:arr){
            map1.computeIfAbsent(x, s -> s+5);
        }

        System.out.println(map1);


    }
}
