package com.java.Basics;
import java.util.Scanner;

public class SoManyChocolates {
//    static int kunal(int a , int b ){
//        if (a<=10 && b>=10) {
//            return 1;
//
//            else if (a % 2 == 0 || b % 2 == 0)
//                return 2;
//
//            if (a != b)
//                return 3;
//        }
//
//        return a;
//    }
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

//            Scanner sc = new Scanner(System.in);
//            int N = sc.nextInt();
//            int temp = 0;
//
//            for(int i = 0; i<N; i++){
//                if(i%2==0){
//                    temp = 1 ;
//
//                }
//            }
//            if (temp==1){
//                System.out.println(N + " is even number");
//            }
//            else{
//                System.out.println(N + " is odd number");
//            }
            Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            if (a<=10 && b>=10){
//                System.out.print("true ");
//            }else{
//                System.out.print("false ");
//            }
//            if (a%2==0 || b%2==0){
//                System.out.print("true ");
//            }else{
//                System.out.print("false ");
//            }
//            if (a!=b){
//                System.out.print("true ");
//            }else{
//                System.out.print("false ");
//            }
            // P = A
            // Q = B
            // R = C
//             S = D
            // int max = P + Q + R + S

//            int arr[] = new int[4];
//            int max = 0;
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = sc.nextInt();
//            }
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] > max) {
//                    max = arr[i];
//                }
     /*       float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();*/
            float a = sc.nextInt();
            float b = sc.nextInt();
            float c = sc.nextInt();

            int i = 0;

            float d = (b * b) - (4 * a * c);
            float sq = (float) Math.sqrt(d);
            float first = 0.0f, second = 0.0f, imaginary = 0.0f;

            if (d > 0) {
                i = 1;
            }

            if (d < 0) {
                i = 2;
            }

            if (d == 0) {
                i = 3;
            }

            switch (i) {

                case 1: {
                    first = (-b + sq) / (2 * a);
                    second = (-b - sq) / (2 * a);
                    String str1 = String.format("%.2f", first);
                    String str2 = String.format("%.2f", second);
                    System.out.println(str1);
                    System.out.print(str2);
                    break;
                }

                case 2: {
                    first = (-b) / (2 * a);
                    sq = (float) Math.sqrt(-d);
                    imaginary = sq / (2 * a);
                    String str1 = String.format("%.2f", first);
                    String str2 = String.format("%.2f", imaginary);
                    System.out.println(str1 + "+i" + str2);
                    System.out.print(str1 + "-i" + str2);
                    break;
                }

                case 3: {
                    first = (float) (-b) / (2 * a);
                    String str = String.format("%.2f", first);
                    System.out.println(str);
                    System.out.print(str);
                    break;
                }

            }








            }
        }

