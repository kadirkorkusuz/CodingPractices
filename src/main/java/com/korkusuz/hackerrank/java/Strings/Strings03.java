package com.korkusuz.hackerrank.java.Strings;

import java.util.*;

public class Strings03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i = 0; i < s.length()-k+1; i++) {
            if (s.substring(i, i+k).compareTo(smallest) < 0) {
                smallest = s.substring(i, i+k);
            }
            if (s.substring(i, i+k).compareTo(largest) > 0) {
                largest = s.substring(i, i+k);
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
