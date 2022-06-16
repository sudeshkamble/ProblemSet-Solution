package com.cs.leetcode;

import java.util.Arrays;

public class CSAS {
    public static void main(String[] args) {
        System.out.println(csas(new int[]{23, 2, 4, 6, 7},6));
        System.out.println(csas(new int[]{23, 2, 4, 6, 6},6));
    }

    private static boolean csas(int[] nums, int k) {
        return (Arrays.stream(nums).sum()%k==0);

    }
}
