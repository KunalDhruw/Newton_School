package com.java.Basics;

import java.util.*;
public class HeightofBuilding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int building = sc.nextInt();
        int []arr = new int[building];
        for(int i=0; i<building; i++){
            arr[i]= sc.nextInt();
        }
        int count = 1;
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                count++;
                max=arr[i];
            }
        }
        System.out.println(count);
    }
}
