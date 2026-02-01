package org.example;

import java.util.ArrayList;
import java.util.List;

public class Factorizer {

    
    public List<Integer> getPrimeFactors(int number) {
      // Implement your code here!
        if (number < 2) {
            throw new IllegalArgumentException("Number must be 2 or larger to have prime factors.");
        }

        List<Integer> factors = new ArrayList<>();
        int n = number;

        // Factor out even
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        // Factor out odd, begin with 3
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        return factors;
    }
}

