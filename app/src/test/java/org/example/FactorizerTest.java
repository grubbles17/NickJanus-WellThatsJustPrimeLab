package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;

class FactorizerTest {

    @Test
    void testOdd() {
        Factorizer f = new Factorizer();
        assertEquals(Arrays.asList(3,5), f.getPrimeFactors(15));
    }
   
    @Test
    void testEven() {
        Factorizer f = new Factorizer();
        assertEquals(Arrays.asList(2,2,5), f.getPrimeFactors(20));
    }

    @Test
    void testHundred() {
        Factorizer f = new Factorizer();
        assertEquals(Arrays.asList(2, 2, 5, 5), f.getPrimeFactors(100));
    }   
}

