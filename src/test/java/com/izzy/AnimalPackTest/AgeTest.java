package com.izzy.AnimalPackTest;

import com.izzy.AnimalPack.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeTest {
    @Test
    public void testAge(){
        Dog testDog = new Dog(11,15);
        assertEquals(0, testDog.getSize(), "The expected weight of the dog was wrong");
    }
}