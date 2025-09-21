package com.korkusuz.hackerrank.java.Strings;

import java.io.*;
import java.util.*;

public class Strings08 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    String pattern;
    MyRegex () {
        this.pattern = "^((000|[0-9]|[0-9][0-9]|0[0-9][0-9]|00[0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";
    }
}
