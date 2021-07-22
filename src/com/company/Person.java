package com.company;

import java.awt.*;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

public class Person {
    @SignCode(value = 5)   String surName;
    @SignCode(value = 5)  String name;
    @SignCode(value = 5)   int yearOfBirthday;

    @SignCode(value = 5)
    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", yearOfBirthday=" + yearOfBirthday +
                '}';
    }
    @SignCode(value = 5)
    public Person(String surName, String name, int yearOfBirthday) {
        this.surName = surName;
        this.name = name;
        this.yearOfBirthday = yearOfBirthday;
    }
@SignCode(5)
   public static void print(){
        Person p = new Person();
        try{
            Class<?> c = p.getClass();
            Method m = c.getMethod("print");
            SignCode sign = m.getAnnotation(SignCode.class);
            System.out.println(sign.value());
        }catch(NoSuchMethodException e){
            e.printStackTrace();
        }
    }
}
