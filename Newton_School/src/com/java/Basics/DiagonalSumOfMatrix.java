package com.java.Basics;

import java.util.*;
public class DiagonalSumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        // Declaring and initializing two variables to zero
        // initially for primary and secondary diagonal
        // count
        int Pd = 0, Sd = 0;
        for(int i=0; i<n; i++)
        {
            // Since for primary diagonal sum the value of
            // row and column are equal
            Pd += arr[i][i];

            // For secondry diagonal sum values of i'th index
            // and j'th index sum is equal to n-1 at each
            // stage of matrix
            Sd += arr[i][n-(i+1)];
        }
        // Print and display the sum of primary diagonal
        System.out.println(Pd+" "+Sd);
        // Print and display the sum of secondary diagonal

    }
}
