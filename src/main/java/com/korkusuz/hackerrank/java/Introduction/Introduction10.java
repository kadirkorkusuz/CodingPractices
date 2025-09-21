package com.korkusuz.hackerrank.java.Introduction;

import java.util.Scanner;

public class Introduction10 {

    static int B, H;
    static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            System.out.println(B * H);
        }
    }
}