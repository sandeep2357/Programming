package com.interviewbit.practice.twopointers;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		/*A.add(-1);
		A.add(2);
		A.add(1);
		A.add(4);*/
		A.add(-1);
		A.add(5);
		A.add(-2);
		A.add(-10);
		A.add(10);
		System.out.println(threeSumClosest(A, 5));
	}
	
	public static int threeSumClosest(ArrayList<Integer> A, int B) {
		int len = A.size();
		int i,j,k,ret=0;
		int diff=Integer.MAX_VALUE;
		Collections.sort(A);
		for(i=0;i<len-2;i++){
			j=i+1;k=len-1;
			while(j<k){
				int tmpDiff = B - (A.get(i)+A.get(j)+A.get(k));
				if(tmpDiff==0){
                    return B;
                }
				if(Math.abs(tmpDiff)<diff){
					diff = Math.abs(tmpDiff);
					ret = (A.get(i)+A.get(j)+A.get(k));
				}
				if(tmpDiff<0){
					k--;
				}else{
					j++;
				}
			}
		}
		return ret;
    }

}
