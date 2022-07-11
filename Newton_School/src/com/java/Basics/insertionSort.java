package com.java.Basics;

import java.util.*;
public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int j=0; j<arr.length; j++){
                arr[j] = sc.nextInt();
            }
            for(int k=1; k<arr.length; k++){
                int temp = arr[k] , l =k;
                while(l>0 && arr[l-1]>temp){
                    arr[l] = arr[l-1];
                    l--;
                }
                arr[l] = temp;
            }
            for(int val:arr){
                System.out.print(val +" ");
            }
        }
    }
}
