package com.luxoft.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionExample {

    void example(){
        Collection<Integer> collection = new ArrayList<>();
        collection.add(5);
        collection.add(7);
        collection.add(9);
        collection.size();

        Collection<Integer> collection1 = new ArrayList<>();
        collection1.addAll(collection);

        collection.remove(9);

        System.out.println(collection);
        System.out.println(collection1);

        Collection<String> collection2 = new LinkedList<>();
        collection2.add("John");
        collection2.add("Sarah");
        collection2.add("Patrick");

        Collection<String> collection3 = new LinkedList<>();
        collection3.add("Patrick");

        collection2.removeAll(collection3);
        System.out.println(collection2);

        collection2.retainAll(collection3);
        System.out.println(collection2);

        System.out.println(collection1.contains(collection));
        System.out.println(collection2.isEmpty());
        System.out.println(collection3.contains("Patrick"));

        System.out.println("--------------------------");
        Iterator<String> iterator = collection3.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String value:collection3)
            System.out.println(value);
    }
}
