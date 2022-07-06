package com.java.Basics;

import java.io.*;
import java.util.*;
public class ArraymaxNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int j = 1; j <= T; j++) { // Outer For Loop will run T number of times
            int N = sc.nextInt();
            long[] arr = new long[N];

            for (int i = 0; i < N; i++) { // Inner For Loop
                arr[i] = sc.nextLong();
            } // End of Inner For Loop

            long second = 0;
            long first = 0;
            long third = 0;

            for (int i = 0; i < N; i++) { // Loop for getting required values
                if (arr[i] > first) {
                    third = second;
                    second = first;
                    first = arr[i];
                } else if (arr[i] > second) {
                    third = second;
                    second = arr[i];
                } else if (arr[i] > third)
                    third = arr[i];
            } // End of Loop for getting required values

            System.out.println(first + " " + second + " " + third);
        } //End of Inner for Loop


    }
}
