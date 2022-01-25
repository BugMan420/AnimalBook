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
    public void eat()
    {
        System.out.println("I like dog food and my own poop!");
        Dog.size = this.size+1;
    }

}
