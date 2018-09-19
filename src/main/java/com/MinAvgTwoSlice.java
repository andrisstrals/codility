package com;

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        int minidx = -1;
        double minval = Integer.MAX_VALUE;
        for(int i = 0; i < A.length -1; ++i) {
            double slice = Integer.MAX_VALUE;
            double sum = A[i];

            for(int j = i + 1; j < A.length; ++j) {
                sum += A[j];
                double val = sum / (j - i + 1);
                if(val < slice) {
                    slice = val;
                }
                else //if(val > slice)
                {
                    break;
                }
            }

            if(slice < minval) {
                minval = slice;
                minidx = i;
            }
        }
        return minidx;
    }
}
