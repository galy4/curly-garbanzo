package com.luxoft.collections;

public class School implements Comparable<School>{

    int capacity;

    @Override
    public int compareTo(School school) {
       return this.capacity - school.capacity;
    }

}
