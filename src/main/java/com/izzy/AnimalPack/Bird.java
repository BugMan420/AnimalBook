package com.izzy.AnimalPack;

public abstract class Bird extends Animal{
    public static int wingspan;
    public Bird(int wingspan) {

    }
    public int getWingspan (){

        return wingspan;
    }

    public void setWingspan (int i){

        wingspan = i;
    }

    public String breathing(){
        return "I breathe using lungs.";
    }

    public String reproduction(){
        return "I produce eggs";
    }
}
