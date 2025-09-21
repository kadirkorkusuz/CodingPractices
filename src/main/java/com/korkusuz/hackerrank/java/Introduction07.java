package com.korkusuz.hackerrank.java;

import java.util.Scanner;

public class Introduction07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();

            StringBuilder out = new StringBuilder();
            long term = a;
            long pow2 = 1; // 2^0

            for (int i = 0; i < n; i++) {
                term += pow2 * b;   // add b * 2^i
                pow2 <<= 1;         // next power of two
                if (i > 0) out.append(' ');
                out.append(term);
            }
            System.out.println(out);
        }
        sc.close();
    }
}