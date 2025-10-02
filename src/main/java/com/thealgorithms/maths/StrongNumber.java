package com.thealgorithms.maths;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sumOfFactorials = 0;

        while (number != 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }

        if (sumOfFactorials == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number.");
        } else {
            System.out.println(originalNumber + " is not a Strong Number.");
        }
        scanner.close();
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
