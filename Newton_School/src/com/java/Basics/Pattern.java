package com.java.Basics;

import java.util.*;
public class Pattern {
    public static int takeInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        return arr[n];
    }
    public static void print(int[]arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static void Pattern(int N){

        outermost: for(int i =1;i<=N+1;i++){
            for(int j =1;j<=i;j++){
                if(i==2){
                    continue outermost;
                }
                if(i==N+1){
                    System.out.print("*");
                }
                else if(j>1 && j<i){
                    System.out.print("^");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }
}



