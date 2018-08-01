package com.interviewbit.practice.arrays;

import java.util.ArrayList;

public class PrettyPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int A = 4;
		System.out.println(prettyPrint(A));
	}
	
	public static ArrayList<ArrayList<Integer>> prettyPrint(int A) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(A==0){
			return res;
		}
		int k = 2*A-1;
		int i,j,m,l,z,y;
		ArrayList<Integer> temp = new ArrayList<Integer>(k);
		for(i=0;i<k;i++){
			temp.add(0);
		}
		for(i=0;i<k;i++){
			res.add((ArrayList<Integer>)temp.clone());
		}
		for(i=0;i<A;i++){
			m = A;
			j=0;
			while(j<=i ){
				res.get(i).set(j,m--);
				j++;
			}
			m++;
			while(j<k-i){
				res.get(i).set(j,m);
				j++;
			}
			while(j<k){
				res.get(i).set(j,++m);
				j++;
			}
		}
		for(i=A;i<k;i++){
			res.set(i,res.get(k-i-1));
		}
		return res;
    }

}
