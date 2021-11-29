package com.luxoft.collections;

import java.util.*;

public class Less5 {

    public static void main(String[] args){
        /*
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
                charMap.replace(str.charAt(i), charMap.get(str.charAt(i)) + 1);
        }
        System.out.println(charMap);

        //---------------

        Map<Integer,Integer> map1 = new HashMap<>();
        Integer[] arr = {2,3,5};
        for(Integer x:arr){
            map1.computeIfAbsent(x, s -> s+5);
        }

        System.out.println(map1);
*/
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(2);
        set.add(2);
        System.out.println(set);

        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Alice");
        sortedSet.add("Jack");
        sortedSet.add("Mary");
        sortedSet.add("Ennie");
        System.out.println(sortedSet.last());
        System.out.println(sortedSet.subSet("Ennie", "Mary"));

        School school25 = new School();
        school25.capacity = 1000;

        School school64 = new School();
        school64.capacity = 800;

        if(school25.compareTo(school64)>0)
            System.out.println("school 25 is bigger");
        else
            System.out.println("school 64 is bigger");

        System.out.println(comparator.compare(school25, school64));

        List<String> list = new ArrayList<>(5);
        list.add("apple");
        list.add("orange");
        list.add("banana");

        int list_length = list.size();
        list.get(1);

        List<String> linkedList = new LinkedList<>();
        linkedList.addAll(list);
        linkedList.get(2);


        Map<String,Double> treeMap = new TreeMap<>();
        treeMap.put("weekdays", 5d);
        treeMap.put("weekend", 2d);
        treeMap.get("weekend");
    }

    public static Comparator<School> comparator = new Comparator<School>() {
        @Override
        public int compare(School school, School t1) {
            return t1.capacity - school.capacity;
        }
    };

}
