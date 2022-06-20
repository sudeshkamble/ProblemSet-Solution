package com.cs.leetcode;

public class FibonacciDP {

    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(tribonacci(25));
        System.out.println(climbingsteps(10));
    }

    private static int climbingsteps(int i) {
        return fib(i+1);
    }

    private static int tribonacci(int n) {
        int[] tdp=new int[n+1];
        tdp[0]=0;
        tdp[1]=1;
        tdp[2]=1;
        for (int i=3;i<=n;i++){
            tdp[i]=tdp[i-1]+tdp[i-2]+tdp[i-3];
        }

        return tdp[n];
    }


    private static int fib(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
