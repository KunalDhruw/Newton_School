//        So many chocolates? (Contest)
//        Easy
//
//        hint
//        Hint
//
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        It's Solo's 1st birthday and everyone is gifting her chocolates. There are N guests invited, the ith guest gives Solo A[i] chocolates.
//
//        Find the total number of chocolates that Solo receives.
//        Input
//        The first line of the input contains an integer N, the number of guests.
//        The second line of the input contains N integers A[1], A[2],. , A[N]
//
//        Constraints
//        1 <= N <= 100
//        1 <= A[i] <= 100
//        Output
//        Output a single integer, the total number of chocolates that Solo receives.
//        Example
//        Sample Input
//        5
//        1 2 4 3 2
//
//        Sample Output
//        12
//
//        Explanation: Solo receives a total of 1+2+4+3+2 = 12 chocolates.
//
//        Sample Input
//        1
//        2
//
//        Sample Output
//        2

package com.java.Basics;
import java.util.Scanner;

public class SoManyChocolates {

        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
//
            float a = sc.nextInt();
            float b = sc.nextInt();
            float c = sc.nextInt();

            int i = 0;

            float d = (b * b) - (4 * a * c);
            float sq = (float) Math.sqrt(d);
            float first = 0.0f, second = 0.0f, imaginary = 0.0f;

            if (d > 0) {
                i = 1;
            }

            if (d < 0) {
                i = 2;
            }

            if (d == 0) {
                i = 3;
            }

            switch (i) {

                case 1: {
                    first = (-b + sq) / (2 * a);
                    second = (-b - sq) / (2 * a);
                    String str1 = String.format("%.2f", first);
                    String str2 = String.format("%.2f", second);
                    System.out.println(str1);
                    System.out.print(str2);
                    break;
                }

                case 2: {
                    first = (-b) / (2 * a);
                    sq = (float) Math.sqrt(-d);
                    imaginary = sq / (2 * a);
                    String str1 = String.format("%.2f", first);
                    String str2 = String.format("%.2f", imaginary);
                    System.out.println(str1 + "+i" + str2);
                    System.out.print(str1 + "-i" + str2);
                    break;
                }

                case 3: {
                    first = (float) (-b) / (2 * a);
                    String str = String.format("%.2f", first);
                    System.out.println(str);
                    System.out.print(str);
                    break;
                }

            }








            }
        }

