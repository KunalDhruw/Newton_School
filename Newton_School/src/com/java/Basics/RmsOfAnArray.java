package com.java.Basics;

import java.util.Scanner;

public class RmsOfAnArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        double squares;
        double sum_of_squares = 0;
        double mean = 0;

        for (int i = 0; i < arr.length; i++) {
            squares = arr[i] * arr[i];
            sum_of_squares = sum_of_squares + squares;
            //    System.out.println("squares of values are = " + squares);
        }

        //    System.out.println("sum of squares are = " + sum_of_squares);
        mean = sum_of_squares / arr.length;
        //    System.out.println("mean is = " + mean);
        double d = Math.sqrt(mean);
        //    System.out.println("square root of mean is = " + String.format("%6f", d));
        System.out.print(String.format("%6f", d));
    }
}
