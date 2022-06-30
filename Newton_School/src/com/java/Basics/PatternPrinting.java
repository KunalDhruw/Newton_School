package com.java.Basics;

public class Pattern_Printing {
    static void pattern(int n) {
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
