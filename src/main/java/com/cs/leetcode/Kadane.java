package com.cs.leetcode;

import java.util.Arrays;

public class Kadane {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,-1}));
    }

    private static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;

        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);

            if(sum<0)
                sum = 0;
        }

        return max;
    }
}
