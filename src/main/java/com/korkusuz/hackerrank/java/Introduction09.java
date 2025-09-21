package com.korkusuz.hackerrank.java;

import java.util.Scanner;

public class Introduction09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNo = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(++lineNo + " " + line);
        }
        sc.close();
    }
}