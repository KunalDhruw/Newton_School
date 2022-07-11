package com.java.Basics;

import java.util.*;
public class closePAir {
    static void printClosest(int []arr , int [] arr2 , int m , int n , int x)
    {
        // Initialize the diff between pair sum and x.
        int diff = Integer.MAX_VALUE;

        // res_l and res_r are result indexes from ar1[] and ar2[]
        // respectively
        int res_l = 0, res_r = 0;

        // Start from left side of ar1[] and right side of ar2[]
        int l = 0, r = n-1;
        while (l<m && r>=0)
        {
            // If this pair is closer to x than the previously
            // found closest, then update res_l, res_r and diff
            if (Math.abs(arr[l] + arr2[r] - x) < diff)
            {
                res_l = l;
                res_r = r;
                diff = Math.abs(arr[l] + arr2[r] - x);
            }

            // If sum of this pair is more than x, move to smaller
            // side
            if (arr[l] + arr2[r] > x)
                r--;
            else  // move to the greater side
                l++;
        }

        // Print the result
//        System.out.print("The closest pair is [" + arr[res_l] +
//                ", " + arr2[res_r] + "]");
        System.out.println((x)-(arr[res_l]+arr2[res_r]));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int []arr = new int[length];
        int []arr2 = new int[length];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i< arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int m = arr.length;
        int n = arr2.length;
        printClosest(arr,arr2,m,n,x);
//        (int m, int n, int ar1[], int ar2[], int x)
//        int ar1[] = {1, 4, 5, 7};
//        int ar2[] = {10, 20, 30, 40};
//        int m = ar1.length;
//        int n = ar2.length;
//        int x = 32;
//        printClosest(ar1, ar2, m, n, x);
    }
}
