package com.korkusuz.hackerrank.java.BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInteger02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        sc.close();

        System.out.println(a.isProbablePrime(1) ? "prime" : "not prime");
    }
}
