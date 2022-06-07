package com.cs.leetcode;

import java.util.Arrays;

public class LCP {
    public static void main(String[] args) {
        lcp(new String[]{"dog","racecar","car"});
    }
    static String lcp(String strs[]){
        String lcp="";
        int minIndex=0;
        int minSize=Integer.MAX_VALUE;
        int arrLen=strs.length;
        for(int i=0;i<arrLen;i++){
            int strLen=strs[i].length();
            if(strLen<minSize) {
                minSize = strLen;
                minIndex = i;
            }
        }
        lcp = strs[minIndex];
        while(!lcp.equals("")) {
            int lcpLen=lcp.length();
            int i = 0;
            for (i = 0; i < arrLen; i++) {
                String toComp=strs[i].substring(0,lcpLen);
                if(!lcp.equals(toComp)){
                    break;
                }
            }
            if(i==arrLen)
                return lcp;

            lcp=lcp.substring(0,lcpLen-1);
        }

        return lcp;

    }
}
