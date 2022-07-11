package com.java.Basics;

import java.util.*;
public class compresedstring {
    public static String compresString(String text) {
        int length = text.length();
        /*
         *  Compression makes sense at length of larger than or equal to 3.
         *  For instance: "aaa" -> "a3"
         */
        if(length > 2) {
            String compressedText = "";
            char lastChar = text.charAt(0);
            int charCount = 1;
            for(int i = 1; i < length; i++) {
                if(text.charAt(i) == lastChar) charCount++;
                else {
                    compressedText += Character.toString(lastChar) + Integer.toString(charCount);
                    lastChar = text.charAt(i);
                    charCount = 1;
                }
            }
            compressedText += Character.toString(lastChar) + Integer.toString(charCount);
            if(compressedText.length() < length)
                return compressedText;
        }		return text;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s1 = sc.next();
        System.out.println(compresString(s1));
    }
}
