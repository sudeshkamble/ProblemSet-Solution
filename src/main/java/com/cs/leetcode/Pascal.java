package com.cs.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public static void main(String[] args) {
        int rowIndex=4;
        List<List<Integer>> finalList=new ArrayList<>();
        List<Integer> prevIntList=new ArrayList<>();
        prevIntList.add(1);
        finalList.add(prevIntList);
        print(prevIntList, rowIndex,1);
        for(int i=2;i<=rowIndex;i++){
            List<Integer> intList=new ArrayList<>();
            for(int k=0;k<i;k++){
                if(k==0)
                    intList.add(1);
                else if(k==i-1)
                    intList.add(1);
                else
                    intList.add(prevIntList.get(k)+prevIntList.get(k-1));
            }
            //print(intList,rowIndex,i);
            prevIntList=new ArrayList<>();
            prevIntList.addAll(intList);
            finalList.add(prevIntList);

        }
        System.out.println(finalList.toString());
    }

    private static void print(List<Integer> prevIntList, int n,int i) {
        for(int k=0;k<n-i;k++)
                System.out.print(" ");
        for(int k=0;k<prevIntList.size();k++){
            System.out.print(prevIntList.get(k)+" ");
        }
        System.out.println();
    }
}
