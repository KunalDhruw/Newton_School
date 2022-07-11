package com.java.Basics;

import java.util.*;
public class SumOfUpperTriangleAndLowerTraingleMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int upper_sum = 0;
        int lower_sum = 0;
        /*calculate sum of upper triangle*/
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            {
                if (i <= j)
                {
                    upper_sum += arr[i][j];
                }
            }
               /*calculate sum of lower*/
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            {
                if (j <= i)
                {
                    lower_sum += arr[i][j];
                }
            }
        System.out.print(upper_sum+" "+lower_sum);
    }
}
