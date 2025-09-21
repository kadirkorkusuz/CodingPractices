package com.korkusuz.hackerrank.java.Strings;

import java.io.*;
import java.util.*;

public class Strings06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();

        if (s.isEmpty()) {
            System.out.println("0");
            return;
        }
        String[] result = s.split("[ !,?._'@]+");
        System.out.println(result.length);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        scan.close();
    }
}
