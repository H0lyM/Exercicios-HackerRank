package Algorithms.Implementation;

import java.math.BigInteger;

public class ExtraLongFactorials {
    //https://www.hackerrank.com/challenges/extra-long-factorials/problem

    static void extraLongFactorials(int n) {
        BigInteger factoredNumber = BigInteger.valueOf(1);
        while (n > 1) {
            factoredNumber = factoredNumber.multiply(BigInteger.valueOf(n));
            n--;

        }
        System.out.println(factoredNumber);
    }

    public static void main(String[] args) {
        extraLongFactorials(25);
    }
}