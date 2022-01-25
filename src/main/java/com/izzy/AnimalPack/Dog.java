package com.izzy.AnimalPack;

public class Dog extends Mammal{
    public Dog() {}

    @Override
    public void eat(String food)
    {
        System.out.println("I like dog food and my own poop!");
    }

    public void dogName()
        {
        System.out.println("My name is "+ name);
        }


}
