package com.korkusuz.hackerrank.java.Strings;

import java.io.*;
import java.util.*;

public class Strings04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean k = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                k = false;
                break;
            }
        }
        System.out.println(k ? "Yes" : "No");
    }
}
