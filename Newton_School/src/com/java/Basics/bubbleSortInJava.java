package com.java.Basics;

import java.util.*;
public class bubbleSortInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = { -6, 3, 1, 2, 7, 9, 87};
        int temp =0;
        int count ;
        for (int i=0; i<arr.length; i++){
            int min = arr[i];
            count = 0;
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count = 1;
                }
            }
            if (count == 0){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
