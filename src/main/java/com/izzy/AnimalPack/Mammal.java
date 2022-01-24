package com.izzy.AnimalPack;

public abstract class Mammal extends Animal {
    public Mammal(int age, int size) {
        super(age, size);
    }

    public String Breathing(){
        return "I breathe using lungs.";
    }

    public String Reproduction(){
        return "I produce live young";
    }

}
