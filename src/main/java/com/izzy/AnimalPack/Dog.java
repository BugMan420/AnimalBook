package com.izzy.AnimalPack;

public class Dog extends Mammal{
    public Dog(int age, int size) {
        super.breathing();
        super.reproduction();
        super.excretion();
        this.age = age;
        this.size = size;
    }

    @Override
    public String eat()
    {
        Dog.size = this.size+1;
        return "I like dog food and my own poop!";
    }

}
