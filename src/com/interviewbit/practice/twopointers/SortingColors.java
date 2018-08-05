package com.interviewbit.practice.twopointers;

import java.util.ArrayList;

public class SortingColors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(1);
		a.add(2);
		a.add(0);
		a.add(1);
		a.add(2);
		sortColors(a);
		System.out.println(a);
	}
	
	public static void sortColors(ArrayList<Integer> a) {
		int i,len = a.size();
		int zCount=0,oCount=0,tCount=0;
		for(i=0;i<len;i++){
			if(a.get(i).equals(0)){
				zCount++;
			}else if(a.get(i).equals(1)){
				oCount++;
			}else{
				tCount++;
			}
		}
		for(i=0;i<zCount;i++){
			a.set(i,0);
		}
		for(;i<oCount+zCount;i++){
			a.set(i,1);
		}
		for(;i<tCount+zCount+oCount;i++){
			a.set(i,2);
		}
    }

}
