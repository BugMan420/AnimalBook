package com.izzy.AnimalPack;

public class Dog extends Mammal{
    public Dog(int age, int size) {
        super.Breathing();
        super.Reproduction();
        super.excretion();
        this.age = age;
        this.size = size;
    }

    @Override
    public void eat(String food)
    {
        System.out.println("I like dog food and my own poop!");
    }

}
