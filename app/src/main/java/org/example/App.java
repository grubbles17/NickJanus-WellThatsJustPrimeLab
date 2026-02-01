package org.example;
import java.util.List;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    // Test your Factorizer class using a driver program here!
    Factorizer factorizer = new Factorizer();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number >= 2: ");
    if(!scanner.hasNextInt()){
      System.out.println("Invalid, Please enter the proper number...");
      return;  
    }

    int number = scanner.nextInt();
    try{
      List<Integer> factors = factorizer.getPrimeFactors(number);
      System.out.println("Prime factors of " + number + " : " + factors);
    }catch(IllegalArgumentException e){
      System.out.println("Error: " + e.getMessage());
    }
    scanner.close();
  }
}
