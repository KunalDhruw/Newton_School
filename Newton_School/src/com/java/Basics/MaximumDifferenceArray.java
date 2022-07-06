package com.java.Basics;

import java.util.*;
public class MaximumDifferenceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
            // System.out.println(array[i]);
        }
        // arr = {4,12,3,9,2,8,7,1}

        //rightMax = {12,12,9,9,8, 8,  7,  1}
        // leftMin = {4,  4, 3, 3, 2,2,  2,  1}

        // -> 2 loops (time zyada lag rha tha)
        // 1 loop -> 2 loop why?
        // i =0; j =0;
        // gap = 0 -> Increase ;


        int[] leftMin = new int[N];
        int[] rightMax = new int[N];

        leftMin[0] = arr[0];

        for(int i =1; i< N; i++){
            leftMin[i] = Math.min(arr[i], leftMin[i-1]);
        }

        rightMax[N-1]  = arr[N-1];
        for(int j = N -2; j>= 0; j--){
            rightMax[j] = Math.max(arr[j], rightMax[j+1]);
        }

        int low = 0;
        int high =0;
        int maxDiff = -1;

        while(low < N && high <N){
            if(leftMin[low] < rightMax[high]){
                maxDiff = Math.max(maxDiff, high - low);
                high++;
            }else{
                low++;
            }
        }

        System.out.println(maxDiff);
    }
}
