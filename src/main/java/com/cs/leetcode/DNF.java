package com.cs.leetcode;

import java.util.Arrays;

public class DNF {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dnf(new int[]{1,1,2,0,2,1,0,0,2,1})));
    }

    private static int[] dnf(int[] nums) {
        int lo=0;
        int mid=0;
        int hi=nums.length-1;

        while(mid<=hi)
            switch (nums[mid]){
                case 0: int temp=nums[lo];
                        nums[lo]=nums[mid];
                        nums[mid]=temp;
                        mid++;
                        lo++;
                        break;

                case 1: mid++;
                        break;

                case 2: temp=nums[mid];
                        nums[mid]=nums[hi];
                        nums[hi]=temp;

                        hi--;
            }
        return nums;
    }

    private static void swap(int a, int b) {

    }
}
