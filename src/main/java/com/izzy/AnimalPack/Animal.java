package com.izzy.AnimalPack;

public abstract class Animal {
public static int age;
public static int size;
private String name;

public Animal (){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String printName(){
        return ("My name is "+ name);
    }
    public String excretion(){

        return "I poop. ";
    }

    public int getAge (){

        return age;
    }

    public void setAge(int i){

        age = i;
    }

    public int getSize (){

        return size;
    }

    public void setSize (int i){

        size = i;
    }

public abstract String eat ();

public abstract String reproduction();

public abstract String breathing();




}
