package com.java.Basics;

import java.util.*;
public class ArrayDonation {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    long totalDonation = 0;
    long currentDonationToBeMade = 0;

		for (int i = 0; i < n; i++) {

        if (currentDonationToBeMade <= arr[i]) {
            currentDonationToBeMade = arr[i];
        }

        long extraDonationToBeMade = currentDonationToBeMade - arr[i];
        System.out.print(extraDonationToBeMade + " ");

        totalDonation += currentDonationToBeMade;
    }

		System.out.println("");
		System.out.println(totalDonation);

    }

}
