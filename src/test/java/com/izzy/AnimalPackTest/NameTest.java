package com.izzy.AnimalPackTest;

import com.izzy.AnimalPack.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameTest {    @Test
public void ageTest(){
    Dog testDog = new Dog(5,5);
    testDog.setName("Bool");
    assertEquals("Bool", testDog.getName(), "The expected age of the dog was wrong");
}
}
