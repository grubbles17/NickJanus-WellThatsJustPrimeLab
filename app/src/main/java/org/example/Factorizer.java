package org.example;

import java.util.ArrayList;
import java.util.List;

public class Factorizer {
  public ArrayList<Integer> getPrimeFactors(int number) {
    // Implement your code here!
    if (number < 2){
      throw new IllegalArgumentException("The number must be 2 or larger to have prime factors");
    }

    List<Integer> factors = new ArrayList<>();
    //n start with even
    int n = number;

    //Even numbers 2

    while(n % 2 == 0){
      factors.add(2);
      n /= 2;
    }

    //Odd numbers 5

    for(int e = 5; e <= Math.sqrt(e); e += 2){
      while(n % e == 0){
        factors.add(e);
        n /= e;
      }
    }

    //n - even number is prime if > 2

    if(n > 2){
      factors.add(n);
    }

    return new ArrayList<>();
  }
}

