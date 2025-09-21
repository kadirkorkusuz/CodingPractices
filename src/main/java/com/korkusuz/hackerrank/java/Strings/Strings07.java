package com.korkusuz.hackerrank.java.Strings;

import java.util.Scanner;
import java.util.regex.*;

public class Strings07
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0){
            for (int i = 0; i < testCases; i++) {
                String pattern = in.nextLine();
                try {
                    Pattern.compile(pattern);
                    System.out.println("Valid");
                } catch (Exception e) {
                    System.out.println("Invalid");
                }
            }
            break;
        }
        in.close();
    }
}
