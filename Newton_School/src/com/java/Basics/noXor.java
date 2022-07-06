package com.java.Basics;

import java.util.*;
public class noXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        long ans = 0;
        for(int i=1; i<=n; i++){
            long sum = (n-i)^(arr[i-1]);
            ans+=  sum;
        }
        System.out.println(ans);
    }
}
