package com.leetcode.practice;

import java.util.Arrays;

public class PairChain {

	public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b)->a[0]-b[0]);
        int N = pairs.length;
        int[] dp = new int[N];
        Arrays.fill(dp,1);
        
        int i,j;
        for(j=1;j<N;j++){
            for(i=0;i<j;i++){
                if(pairs[i][1]<pairs[j][0]){
                    dp[j]=Math.max(dp[j],dp[i]+1);
                }
            }
        }
        
        int x=0;
        for(i=0;i<N;i++){
            if(dp[i]>x){
                x=dp[i];
            }
        }
        return x;
    }
	
	public static void main(String[] args) {
		
	}
}
