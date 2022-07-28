//        Diagonal Sum
//        Easy
//
//        hint
//        Hint
//
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given a matrix of size N*N, your task is to find the sum of the primary and secondary diagonal of the matrix.
//
//        For Matrix:-
//        M00 M01 M02
//        M10 M11 M12
//        M20 M21 M22
//
//        Primary diagonal:- M00 M11 M22
//        Secondary diagonal:- M02 M11 M20
//        Input
//        The first line of input contains a single integer N, The next N lines of input contains N space-separated integers depicting the values of the matrix.
//
//        Constraints:-
//        1 <= N <= 500
//        1 <= Matrix[][] <= 100000
//        Output
//        Print the sum of primary and secondary diagonal separated by a space.
//        Example
//        Sample Input:-
//        2
//        1 4
//        2 6
//
//        Sample Output:-
//        7 6
//
//        Sample Input:-
//        3
//        1 4 2
//        1 5 7
//        3 8 1
//
//        Sample Output:-
//        7 10

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
