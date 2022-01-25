package com.izzy.AnimalPackTest;

import com.izzy.AnimalPack.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NameTest {
    @Test
    public void Nametest(){
    Dog testDog = new Dog(5,5);
    testDog.setName("Bool");
    assertEquals("Bool", testDog.getName(), "The expected name of the dog was wrong");
}
}
