package com.izzy.AnimalPack;

public class Main {
    public static void main(String args[]) {
        Dog Poodle = new Dog(5, 5);
        Poodle.setName("Bob");
        Poodle.printName();
        System.out.println(Poodle.getSize());
        Poodle.eat();
        System.out.println(Poodle.getSize());
        System.out.println(Poodle.getAge());
        String poop = Poodle.excretion();
        String breathing = Poodle.breathing();
        String reproduction = Poodle.reproduction();
        System.out.println(breathing + poop + reproduction );
    }
}
