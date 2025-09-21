package com.korkusuz.hackerrank.java.Strings;

import java.io.*;
import java.util.*;

public class Strings05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    static boolean isAnagram(String a, String b) {
        var mapA = getMap(a.toLowerCase());
        var mapB = getMap(b.toLowerCase());

        if (mapA.size() != mapB.size())
            return false;
        if (!mapA.keySet().containsAll(mapB.keySet()))
            return false;
        for (var entry : mapA.entrySet()) {
            if (entry.getValue() != mapB.get(entry.getKey()))
                return false;
        }
        return true;
    }

    static HashMap<Character, Integer> getMap (String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            char currentKey = str.charAt(i);
            if (map.containsKey(currentKey)) {
                int currentValue = map.get(currentKey);
                map.put(currentKey, currentValue + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        return map;
    }
}
