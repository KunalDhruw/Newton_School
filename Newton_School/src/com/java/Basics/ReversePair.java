package com.java.Basics;

import java.util.*;
public class ReversePair {
    public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
    private static int mergeSort(int[] nums, int l, int r) {
        if (l >= r) return 0;
        int count = 0;
        int mid = l + (r - l) / 2;
        count += mergeSort(nums, l, mid);
        count += mergeSort(nums, mid + 1, r);
        count += merge(nums, l, mid, r);
        return count;
    }
    private static int merge(int[] nums, int l, int mid, int r) {
        int count = 0, l1 = l, l2 = mid + 1, idx = 0;
        while (l1 <= mid && l2 <= r) {
            if ((long) nums[l1] > (long) 2 * nums[l2]) {
                count += mid - l1 + 1;
                l2++;
            } else l1++;
        }
        l1 = l;
        l2 = mid + 1;
        int[] copy = new int[r - l + 1];
        while (l1 <= mid && l2 <= r) {
            if (nums[l1] > nums[l2]) copy[idx++] = nums[l2++];
            else copy[idx++] = nums[l1++];
        }
        while (l1 <= mid) copy[idx++] = nums[l1++];
        while (l2 <= r) copy[idx++] = nums[l2++];
        System.arraycopy(copy, 0, nums, l, r - l + 1);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(reversePairs(arr));
    }
}
