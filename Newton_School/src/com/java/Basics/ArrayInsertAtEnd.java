package com.java.Basics;

import java.io.*;
import java.util.*;
public class ArrayInsertAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        for(int i=1; i<=t; i++){
            int size = sc.nextInt();
            int arr[] = new int[size];
            int modified = sc.nextInt();

            for(int j=0; j<arr.length; j++){
                arr[j]=sc.nextInt();
            }
            int newarr [] = new int [size + 1 ];
            for (int k=0; k<size; k++){
                newarr[size] = modified;
                newarr[k] = arr[k];
            }
            for (int k=0; k < newarr.length; k++ ){
                System.out.print(newarr[k] + " ");
            }
            System.out.println();
        }
    }
}
