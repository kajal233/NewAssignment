package com.assignment;

///. Create an ArrayList and add 25 numbers. Write a code to print all the prime numbers that are present in it, using lambda expression.
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18,19, 20,21,22,23,24,25);
        // Prime number 
        System.out.println(numbers.stream()
                             .filter(CheckPrimeNumber::isPrime)
                             .collect(toList()));
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
