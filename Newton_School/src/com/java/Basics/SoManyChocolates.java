package com.java.Basics;
import java.util.Scanner;

public class SoManyChocolates {
        public static void main (String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int [] arr = new int[n];
//            for (int i = 0; i<arr.length; i++){
//                arr[i] = sc.nextInt();
//            }
//            int sum = 0;
//            for (int i = 0; i<arr.length; i++){
//                sum = sum + arr[i];
//
//            }
//            System.out.println(sum);

            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int temp = 0;

            for(int i = 0; i<N; i++){
                if(i%2==0){
                    temp = 1 ;

                }
            }
            if (temp==1){
                System.out.println(N + " is even number");
            }
            else{
                System.out.println(N + " is odd number");
            }
            // Your code here
        }
    }

