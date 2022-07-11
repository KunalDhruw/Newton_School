package com.java.Basics;
import java.io.*;
import java.util.*;
public class ZigzagTraversalOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// no. of rows
        int m = sc.nextInt();// no. of columns
        int [][] arr = new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>(n+m-1);
        for(int i = 0; i < n + m - 1; i++)
        {
            ans.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                (ans.get(i+j)).add(arr[i][j]);
            }
        }

        for (int i = 0; i < ans.size(); i++)
        {
            for (int j = ans.get(i).size() - 1; j >= 0; j--)
            {    System.out.print(ans.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }
}
