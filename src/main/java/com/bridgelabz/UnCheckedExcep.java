package com.bridgelabz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedExcep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Performing division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric value.");
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}