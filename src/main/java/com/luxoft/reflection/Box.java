package com.luxoft.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Box {

    List<Object> content = new ArrayList<>();

    public void addToBox(Object o) throws NoSuchFieldException, IllegalAccessException {
        Class clazz = o.getClass();
        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation a : annotations){
            if(a instanceof Boxable){
                Boxable boxable = (Boxable) a;
                if(boxable.isBoxable()){
                    content.add(o);
                }else
                    System.out.println(clazz.getName() + " cannot be added!");

            }
        }
    }
}
