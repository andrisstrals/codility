package com;

import java.util.Arrays;

public class MaxCounters {

    public int[] solution(int N, int [] A) {
        int [] counters = new int[N];
        int allmax = 0;
        int oldallmax = -1;

        for(int x : A) {
            int idx = x-1;
            if(idx < N) {
                counters[idx] += 1;
                if(allmax < counters[idx]) {
                    allmax = counters[idx];
                }
            }
            else if(oldallmax != allmax){
                Arrays.fill(counters, allmax);
                oldallmax = allmax;
            }
        }

        return counters;
    }
}
