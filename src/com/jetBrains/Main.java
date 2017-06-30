package com.jetBrains;
import java.util.Scanner;
//Author: Andres Ibarra
//This program calculates the factorial of any number greater than 0 but less than 26

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to the Factorial Calculator!");
        Scanner scnr = new Scanner(System.in);
        int userInput = 0;
        String loop = "y";
        long calcNumber = 1;
        //highest factorial integer is 25
        while (loop.equals("y")) {
            System.out.println("Enter an integer that's greater than 0 but less than 26: ");
            userInput = scnr.nextInt();

            if (userInput >= 1 && userInput <= 25) { //this conditional statement calculates factorial
                for (int i = 1; i <= userInput; i++) {
                    calcNumber *= i;
                }
                System.out.println("The factorial of " + userInput + " is " + calcNumber);
                calcNumber = 1;
            }
            else {
                System.out.println("Only integers greater than 0 but less than 26");
            }
            System.out.print("Continue? (y/n): ");
            loop = scnr.next();
        }

    }
}