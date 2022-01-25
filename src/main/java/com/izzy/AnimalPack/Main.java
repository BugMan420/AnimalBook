package com.izzy.AnimalPack;

public class Main {
    public static void main(String args[]) {
        Penguin Brad = new Penguin(11,5, 5);
        Brad.setName("Bob");
        Brad.printName();
        System.out.println(Brad.getSize());
        Brad.eat();
        System.out.println(Brad.getSize());
        System.out.println(Brad.getAge());
        String poop = Brad.excretion();
        String breathing = Brad.breathing();
        String reproduction = Brad.reproduction();

        System.out.println(breathing + poop + reproduction +" and my wingspan is " + Brad.getWingspan() );
    }
}
