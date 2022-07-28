//        Max numbers
//        Medium
//
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given an array A of size N, you need to find its maximum, 2nd maximum and 3rd maximum element.
//
//        Try solving it in O(N) per test case
//        Input
//        The first line of the input contains the number of test cases T.
//
//        For each test case, the first line of the input contains an integer N denoting the number of elements in the array A. The next line contains N (space separated) elements of A.
//
//
//        Constraints:
//        1 <= T <= 100
//        3 <= N <= 10^6
//        1 <= A[i] <= 10^9
//
//        Note:-It is guaranteed that the sum of N over all text cases does not exceed 10^6
//        Output
//        For each test case, output the first, second and third maximum elements in the array.
//        Example
//        Sample Input:
//        3
//        5
//        1 4 2 4 5
//        6
//        1 3 5 7 9 8
//        7
//        11 22 33 44 55 66 77
//
//        Sample Output:
//        5 4 4
//        9 8 7
//        77 66 55
//
//        Explanation(might now be the optimal solution):
//        Testcase 1:
//        [1 4 2 4 5]
//        First max = 5
//        Second max = 4
//        Third max = 4

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
