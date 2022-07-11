package com.java.Basics;
import java.util.*;
import java.util.stream.*;
import java.util.Arrays;
public class FindTheStringInMatrix {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        char[][]arr = new char[n][m];
        for(int i=0; i<n; i++){
            String s1 = sc.next();
            for(int j=0; j<s1.length() && j<m; j++){
                arr[i][j]= s1.charAt(j);
            }
        }

        String toCheck = sc.next();
        for(int i=0; i<toCheck.length(); i++){
            boolean flag = false;
            char c = toCheck.charAt(i);
            int row = i%n;
            for(int j=0; j<m; j++){
                if(c==arr[row][j]){
                    arr[row][j]='@';
                    flag = true;
                    break;

                }

            }
            if(!flag){
                System.out.println("No");
                return ;
            }

        }
        System.out.println("Yes");
    }
}
