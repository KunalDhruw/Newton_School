package com.java.Basics;

import java.util.*;
public class PairEmUp {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        Arrays.sort(arr);
        int max=1;
        for(int i=0; i<n; i++){
            int value=arr[i]+arr[n-i-1];
            if(max<value){
                max=value;
            }
        }
        System.out.print(max);

    }
}
