package com.korkusuz.hackerrank.java;

import java.util.*;
import java.math.BigInteger;

public class Introduction08 {

    private static final BigInteger BYTE_MIN  = BigInteger.valueOf(Byte.MIN_VALUE);
    private static final BigInteger BYTE_MAX  = BigInteger.valueOf(Byte.MAX_VALUE);
    private static final BigInteger SHORT_MIN = BigInteger.valueOf(Short.MIN_VALUE);
    private static final BigInteger SHORT_MAX = BigInteger.valueOf(Short.MAX_VALUE);
    private static final BigInteger INT_MIN   = BigInteger.valueOf(Integer.MIN_VALUE);
    private static final BigInteger INT_MAX   = BigInteger.valueOf(Integer.MAX_VALUE);
    private static final BigInteger LONG_MIN  = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger LONG_MAX  = BigInteger.valueOf(Long.MAX_VALUE);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            try {
                BigInteger n = new BigInteger(s);
                List<String> fits = new ArrayList<>();

                if (inRange(n, BYTE_MIN, BYTE_MAX))  fits.add("* byte");
                if (inRange(n, SHORT_MIN, SHORT_MAX)) fits.add("* short");
                if (inRange(n, INT_MIN, INT_MAX))     fits.add("* int");
                if (inRange(n, LONG_MIN, LONG_MAX))   fits.add("* long");

                if (fits.isEmpty()) {
                    System.out.println(s + " can't be fitted anywhere.");
                } else {
                    System.out.println(s + " can be fitted in:");
                    for (String type : fits) System.out.println(type);
                }
            } catch (Exception e) {
                // Not a valid integer representation
                System.out.println(s + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }

    private static boolean inRange(BigInteger n, BigInteger min, BigInteger max) {
        return n.compareTo(min) >= 0 && n.compareTo(max) <= 0;
    }
}