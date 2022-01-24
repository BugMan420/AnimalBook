package com.izzy.AnimalPack;

public abstract class Animal {
public int age = 2;
public int size = 2 ;
String name;

public Animal (int size,int age){};

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
