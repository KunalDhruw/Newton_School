package com.java.Basics;

import java.util.*;
public class RowWithMaximum1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max_one_count = 0;
        int maxRowIndex = -1;
        for (int i=0; i<n; i= i+1){
            int RowOneCount = 0;
            for (int j=0; j<m; j=j+1){
                if (arr[i][j]==1)
                    RowOneCount= RowOneCount + 1 ;
            }
            if (RowOneCount > max_one_count){
                max_one_count = RowOneCount;
                maxRowIndex = i;
            }

        }
        System.out.println(maxRowIndex);

    }
}
