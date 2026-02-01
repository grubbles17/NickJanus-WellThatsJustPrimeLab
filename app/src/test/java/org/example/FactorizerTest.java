package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.Arrays;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.getPrimeFactors(0), new ArrayList<Integer>());
  }

  @Test
  void testPrimeNumbers(){
    Factorizer f = new Factorizer();
    assertEquals(Arrays.asList(15), f.getPrimeFactors(15));
  }

  @Test
  void testHundred(){
    Factorizer f = new Factorizer();
    assertEquals(Arrays.asList(2,2,5,5), f.getPrimeFactors(100));
  }

}

