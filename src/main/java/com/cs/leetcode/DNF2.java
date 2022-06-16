package com.cs.leetcode;

public class DNF2 {
    public static void main(String[] args) {
        dnf2(new int[]{0, 0, 1, 0, 2, 0, 1, 4});
    }

    private static void dnf2(int[] nums) {
        int size=nums.length;
        int count=0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
            while(count < size){
                nums[count]=0;
                count++;
            }
        }
    }
}
