package main.java.dsa;

import java.util.Arrays;

public class MergeIntervals {


    public static void main(String[] args) {

        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] arr = {{1,3},{2,6},{6,7},{8,10},{15,18}};
        int[][] arr1 = {{1,4},{4,5}};
        int[][] arr2 = {{4,7},{1,4}};
        int[][] arr3 = {{2,3},{4,5},{6,7},{8,9},{1,10}};
        int[][] result = mergeIntervals.merge2(arr);
        Arrays.stream(result).forEach(r->{
            System.out.println(r[0]+","+r[1]);
        });

    }
    public int[][] merge(int[][] intervals) {
       /* List<int[]> intList= Arrays.stream(intervals).
                sorted(Comparator.comparing(ints ->ints[0])).toList();*/
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int x =0;
        int[][] result= new int[intervals.length][2];
        result[x] = intervals[0];

        for(int i=1;i<intervals.length;i++) {
             int[] current = intervals[i];
             int max = Math.max(result[x][0], current[0]);
             int min = Math.min(result[x][1], current[1]);
             if (max <= min) {
                 result[x][0]=Math.min(result[x][0], current[0]);
                 result[x][1]=Math.max(result[x][1], current[1]);
             }else {
                 x++;
                 result[x]=current;
             }

        }
       int[][] r = new int[++x][2];
        for (int i =0;i<r.length;i++){
            r[i]=result[i];
        }

        return r;
    }

    public int[][] merge2(int[][] intervals){
        int max = 0;
        for (int i = 0; i < intervals.length; i++) {
            max = Math.max(intervals[i][0], max);
        }
        int[] mp = new int[max + 1];
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            mp[start] = Math.max(end + 1, mp[start]);
        }
        int r = 0;
        int have = -1;
        int intervalStart = -1;
        for (int i = 0; i < mp.length; i++) {
            if (mp[i] != 0) {
                if (intervalStart == -1){
                    intervalStart = i;
                }
                have = Math.max(mp[i] - 1, have);
            }
            if (have == i) {
                intervals[r++] = new int[] { intervalStart, have };
                have = -1;
                intervalStart = -1;
            }
        }

        if (intervalStart != -1) {
            intervals[r++] = new int[] { intervalStart, have };
        }
        if (intervals.length == r) {
            return intervals;
        }

        int[][] res = new int[r][];
        for (int i = 0; i < r; i++) {
            res[i] = intervals[i];
        }

        return res;
    }
}

