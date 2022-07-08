package com.java.Basics;

import java.util.*;
public class SimpleDeterminantOf2X2Matrix {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];

        int i, j, determinant = 0;

        Scanner sc= new Scanner(System.in);


        for(i = 0; i < 2; i++) {   // for number of rows.      4    5
            for(j = 0; j < 2; j++) { // for number of columns. 2    3
                arr[i][j] = sc.nextInt();
            }
        }

        determinant = (arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]);

        System.out.println( determinant );
    }

}
