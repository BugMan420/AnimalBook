package com.izzy.AnimalPackTest;

import com.izzy.AnimalPack.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogEatTest { @Test
public void EatTest(){
    Dog testDog = new Dog(5,5);
    testDog.eat("Turkey");
    assertEquals("I like dog food and my own poop!", "I like dog food and my own poop!", "The dog has eaten the wrong food.");
}
}
