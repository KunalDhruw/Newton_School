package com.java.Basics;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        areaOfSquare(sc.nextInt());
    }
    static void areaOfSquare(int n ){
        System.out.println(n*n);
    }
}
