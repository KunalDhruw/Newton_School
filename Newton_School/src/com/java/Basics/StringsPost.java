package com.java.Basics;

import java.util.*;
import java.util.Arrays;
public class StringsPost {
    static void printarr(int []arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++){
            int n = sc.nextInt();
            int []arr = new int[n];
            for (int j=0; j<arr.length; j++){
                arr[j] = sc.nextInt();
            }

            for (int j=0; j<arr.length; j++){
                arr[j] = arr[j]*arr[j];
            }
            Arrays.sort(arr);
            printarr(arr);
        }
    }
}
