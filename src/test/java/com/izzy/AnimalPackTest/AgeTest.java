package com.izzy.AnimalPackTest;

import com.izzy.AnimalPack.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeTest {
    @Test
    public void testAge(){
        Dog testDog = new Dog();
        testDog.setAge();
        assertEquals(11,testDog.getAge(),"The dog is the wrong age");
}
}
