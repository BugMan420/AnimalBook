package com.izzy.AnimalPackTest;

import com.izzy.AnimalPack.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeTest {
    @Test
    public void testAge(){
        Dog testDog = new Dog(2,2);
        testDog.age = 5;
        testDog.setAge();
        assertEquals(2, testDog.getAge(), "The expected age of the dog was wrong");
    }
}
