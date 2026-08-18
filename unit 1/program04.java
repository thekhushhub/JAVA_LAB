// Write  a  java  program  to  perform  different  arithmetic  operations.

import java.util.Scanner;

public class IntegerArithmetic {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Taking whole numbers from the user
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.println("\n--- Results ---");

        // 1. Addition
        System.out.println("Addition (+) => " + num1 + " + " + num2 + " = " + (num1 + num2));

        // 2. Subtraction
        System.out.println("Subtraction (-) => " + num1 + " - " + num2 + " = " + (num1 - num2));

        // 3. Multiplication
        System.out.println("Multiplication (*) => " + num1 + " * " + num2 + " = " + (num1 * num2));

        // 4. Division & Modulo (with 0-check protection)
        if (num2 != 0) {
            System.out.println("Division (/) => " + num1 + " / " + num2 + " = " + (num1 / num2));
            System.out.println("Modulo (%) => " + num1 + " % " + num2 + " = " + (num1 % num2));
        } else {
            System.out.println("Division (/) => Error: Cannot divide by zero!");
            System.out.println("Modulo (%) => Error: Cannot divide by zero!");
        }
    }
}