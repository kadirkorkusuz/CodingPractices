package com.korkusuz.hackerrank.java;

import java.util.Scanner;

public class Introduction05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3 && sc.hasNext(); i++) {
            String s = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s, x);
        }
        System.out.println("================================");
    }
}