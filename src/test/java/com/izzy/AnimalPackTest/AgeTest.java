package com.izzy.AnimalPackTest;

import com.izzy.AnimalPack.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeTest {
    @Test
    public void ageTest(){
        Dog testDog = new Dog(5,5);
        assertEquals(5, testDog.getAge(), "The expected age of the dog was wrong");
    }
}
