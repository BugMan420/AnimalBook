package com.izzy.AnimalPack;

public abstract class Animal {
public int age;
public int size ;
String name;

public Animal (){};

public abstract void eat (String food);

public abstract String Reproduction();

public abstract String Breathing();

public String excretion(){
    return "I poop";
}

public int getAge (){
    return age;
}

public void setAge(){
    this.age = age;
}

public int getSize (){
    return size;
}

public void setSize (){
    this.size = size;
}

}
