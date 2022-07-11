package com.java.Basics;

import java.util.*;
public class InsertElementInArrayAtGivenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=1; i<=t; i++){
            int N = sc.nextInt();
            int element = sc.nextInt();
            int position = sc.nextInt();
            int [] arr = new int[N - 1];

            for (int j=0; j<arr.length; j++){
                arr[j]=sc.nextInt();
            }
            int [] newarr= new int[ N ];
            for (int k=0; k< newarr.length; k++){
                if (k < position ){
                    newarr[k] = arr[k];
                }
                else if (k == position ){
                    newarr[k] = element;
                }
                else{
                    newarr[k] = arr[k - 1];
                }
            }

            for (int k=0; k< newarr.length; k++){
                System.out.print(newarr[k] + " ");
            }
            System.out.println();
        }
    }
}
