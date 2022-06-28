package com.cs.leetcode;

public class TrapRainWater {
    public static void main(String[] args) {
        trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
    }

    private static int trap(int[] height) {
        int total=0;
        int len=height.length;
        int start=height[0];
        int end=height[1];
        int startIndex=1;
        int endIndex=0;
        for(int i=2;i<len;i++){

        }
        return total;
    }

    private static int findHi(int low,int k,int[] height) {
        for(int i=k;i<height.length; i++){
            if(height[i]>low){
                return i;
            }
        }
        return -1;
    }
}
