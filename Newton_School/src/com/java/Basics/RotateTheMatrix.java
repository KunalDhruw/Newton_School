package com.java.Basics;

import java.util.*;
public class RotateTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] arr = new int[N][N];
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                arr [i][j]= sc.nextInt();
            }
        }// for 90 degree
        for (int j = 0; j < N; j++)
        {
            for (int i = N - 1; i >= 0; i--)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

        // Simply print from last
        // cell to first cell.
        System.out.println();
        // for 180 degree
        for (int i = N - 1; i >= 0; i--) {
            for (int j = N - 1; j >= 0; j--)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }
}

