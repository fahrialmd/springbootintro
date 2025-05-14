package com.example.springbootintro;

import java.math.BigInteger;

public class Fibonacci {
    public BigInteger calculate(int n) {
        // Throw an exception if the input is negative
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        // Handle base cases explicitly
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        // Use an iterative approach to calculate Fibonacci number
        BigInteger a = BigInteger.ZERO, b = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger temp = a.add(b);
            a = b;
            b = temp;
        }

        return b;
    }
}
