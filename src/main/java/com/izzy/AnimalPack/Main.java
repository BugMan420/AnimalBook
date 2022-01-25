package com.izzy.AnimalPack;

public class Main {
    public static void main(String args[]) {
        Dog Poodle = new Dog(11,5);
        Poodle.name = "Fluffy";
        Poodle.age = 5;
        Poodle.dogName();
        Poodle.eat("turkey");
        Poodle.setAge();
        System.out.println("This dog is "+ Poodle.getAge());

    }
}
