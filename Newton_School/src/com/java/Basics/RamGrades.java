package com.java.Basics;

import java.util.Scanner;

public class RamGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum = a + b + c + d;
        int percentage = sum / 4;
        System.out.println(percentage);
    }
}
