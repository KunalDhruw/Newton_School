package com.java.Basics;

public class Pattern {
    static void Pattern(int N){

        outermost: for(int i =1;i<=N+1;i++){
            for(int j =1;j<=i;j++){
                if(i==2){
                    continue outermost;
                }
                if(i==N+1){
                    System.out.print("*");
                }
                else if(j>1 && j<i){
                    System.out.print("^");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    }

