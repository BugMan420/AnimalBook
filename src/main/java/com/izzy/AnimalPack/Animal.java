package com.izzy.AnimalPack;

public abstract class Animal {
public static int age = 0;
public static int size = 0;
private String name;

public Animal (){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("My name is "+name);
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

public abstract void eat (String food);

public abstract String Reproduction();

public abstract String Breathing();




}
