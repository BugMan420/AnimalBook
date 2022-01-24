package com.izzy.AnimalPack;

public abstract class Mammal extends Animal {


    public Mammal(int size, int age) {
        super(size, age);
    }

    public String Breathing(){
        return "I breathe using lungs.";
    }

    public String Reproduction(){
        return "I produce live young";
    }

}
