package com.luxoft.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionEx {

    public static void main(String[] args) throws ClassNotFoundException,
            InvocationTargetException, IllegalAccessException, NoSuchFieldException, InstantiationException, NoSuchMethodException {


        Box box = new Box();
        box.addToBox(new Cat());
        box.addToBox(new Cat());
        box.addToBox(new Poison());
        box.addToBox(new Cat());

        Class<?> clazz = School.class;
        School school = new School();
        Class<?> clazz1 = school.getClass();
        Class<?> clazz2 = Class.forName("com.luxoft.reflection.School");

        String name = clazz.getName();
        System.out.println(name);

        Method[] methods = clazz1.getMethods();
        Field[] fields = clazz1.getDeclaredFields();
        for(Field f:fields)
            System.out.println(f.getName());

        //Invoke method if instance is created
        System.out.println(methods[0].invoke(school,"name"));
//        Invoke method w/o instance
        Method method = clazz2.getDeclaredMethod("getGrade", String.class);
        method.invoke(clazz2.newInstance(), "some");


        Field field = clazz1.getDeclaredField("grade");
        field.setAccessible(true);
        field.setInt(school, 50);


    }
}
