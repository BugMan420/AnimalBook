package com.izzy.AnimalPackTest;

import com.izzy.AnimalPack.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SizeTest { @Test
public void testSize(){
    Dog testDog = new Dog(5,5);
    testDog.setSize(9);
    assertEquals(9, testDog.getSize(), "The expected size of the dog was wrong");
}
}
