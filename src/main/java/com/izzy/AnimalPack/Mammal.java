package com.izzy.AnimalPack;

public abstract class Mammal extends Animal {


    public Mammal() {}

    public String breathing(){
        return "I breathe using lungs.";
    }

    public String reproduction(){
        return "I produce live young";
    }

}
