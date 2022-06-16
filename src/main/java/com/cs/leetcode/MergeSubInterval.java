package com.cs.leetcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MergeSubInterval {
    public static void main(String[] args) throws IOException {
        //merge(new int[][]{{1,2},{2,6},{8,10},{15,18}});
        //merge(new int[][]{{1,4},{0,4}});
        //merge(new int[][]{{2,3},{5,5},{2,2},{3,4},{3,4}});
        //merge(new int[][]{{0,0},{0,0}});
        int[][] arr =readFromFile();
        merge(arr);

    }

    private static int[][] readFromFile() throws IOException {
        String[] inp = Files.readAllLines(Paths.get("D:/input.txt")).get(0).split(";");
        //System.out.println(Arrays.toString(inp));


        return arrayListToArray(Arrays.asList(inp));
    }

    private static void merge(int[][] intervals) {
        List<String> intervalList=new ArrayList<>();
        Arrays.sort(intervals,(i1,i2)->{
            //System.out.println("i1:"+Arrays.toString(i1)+" i2:"+Arrays.toString(i2));
            //System.out.println();
            if(i1[0]==i2[0]){
                 if(i1[1]==i2[1])
                     return 0;
                 else
                     return i1[1]>i2[1]?1:-1;
            }
            else
                return i1[0]>i2[0]?1:-1;
        });
        print(intervals);
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i< intervals.length;i++){
            int[] interval=intervals[i];
            //System.out.println(Arrays.toString(interval));
            if(interval[0]>start && interval[1]<end)
                continue;
            if(end>=interval[0]){
                end=interval[1];
            }
            if(interval[0]>end){
                intervalList.add(start+","+end);
                start=interval[0];
                end=interval[1];
            }
        }
        intervalList.add(start+","+end);
        System.out.println("\nInterval List:"+intervalList);
        arrayListToArray(intervalList);
    }

    private static void print(int[][] intervals) {
        for(int i=0;i< intervals.length;i++){
            System.out.print(Arrays.toString(intervals[i]));
        }
    }

    private static int[][] arrayListToArray(List<String> intervalList) {
        int returnArr[][]=new int[intervalList.size()][2];
        int i=0;
        for(String interval:intervalList){
            returnArr[i][0]=Integer.parseInt(interval.split(",")[0]);
            returnArr[i][1]=Integer.parseInt(interval.split(",")[1]);
            i++;
        }
        return returnArr;
    }
}
