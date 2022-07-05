package com.java.Basics;

import java.util.Scanner;

public class GreatestCommanDivisor {
    public static int gcd(int num_first , int num_second) {
    int i= num_first%num_second;
    while(i!=0){
        num_first = num_second;
        num_second = i ;
        i = num_first%num_second;
    }
    return num_second;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number");
        int num2 = sc.nextInt();
        System.out.println("Greatest comman divisor = " + gcd(num1 , num2));

    }
}
