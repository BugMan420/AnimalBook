package com.izzy.AnimalPackTest;

import com.izzy.AnimalPack.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeTest {
    @Test
    public void testAge(){
        Dog testDog = new Dog();
        testDog.age = 5;
        testDog.setAge();
        assertEquals(5, testDog.getAge(), "The expected age of the dog was wrong");
    }
}
