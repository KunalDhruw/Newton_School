package com.java.Basics;

import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator;
        int a , b ;
        System.out.println("select your operator (+ , - , * , /)");
        operator = sc.next().charAt(0);
        System.out.println("Enter your number one");
        a = sc.nextInt();
        System.out.println("Enter your number two");
        b = sc.nextInt();
        switch (operator){
            case '+' :
                System.out.printf("%d + %d = %d" , a , b , a+b);
                break;
            case '-' :
                System.out.printf("%d - %d = %d", a , b , a-b);
                break;
            case '*' :
                System.out.printf("%d * %d = %d", a , b , a*b);
                break;
            case '/' :
                if(b!=0)
                System.out.printf("%d / %d = %d", a , b , a / b );
                else
                System.out.println("division by zero situation");
                break;
            default:
                System.out.printf("%c invalid operator", operator);
        }
    }
}
