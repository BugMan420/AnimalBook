package com.izzy.AnimalPack;

public class Penguin extends Bird {
    public Penguin(int wingspan, int size, int age) {
        super(wingspan);
        super.breathing();
        super.reproduction();
        super.excretion();
        this.age = age;
        this.size = size;
        this.wingspan = wingspan;
    }

    @Override
    public String eat() {
        Penguin.size = this.size+1;
        return "I like to eat fish!";
    }
}


