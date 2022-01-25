package com.izzy.AnimalPackTest;

import com.izzy.AnimalPack.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogEatTest { @Test
public void testEat(){
    Dog testDog = new Dog(5,5);
    testDog.eat();
    assertEquals(6,testDog.size,"The dog is the wrong size");

}
}
