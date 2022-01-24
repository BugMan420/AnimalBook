package com.izzy.AnimalPack;

public class Dog extends Mammal{

    public Dog(int age, int size) {
        super(age, size);
    }

    @Override
    public void eat(String food) {
        System.out.println("I like dog food and my own poop");
    }

    public static void main(String args[]){
        Dog Max = new Dog (11,10);
    }
}