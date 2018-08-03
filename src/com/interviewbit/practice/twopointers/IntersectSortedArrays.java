package com.interviewbit.practice.twopointers;

import java.util.ArrayList;
import java.util.List;

public class IntersectSortedArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		/*A.add(1);
		A.add(2);
		A.add(3);
		A.add(3);
		A.add(4);
		A.add(5);
		A.add(7);*/
		A.add(1000000);
		ArrayList<Integer> B = new ArrayList<Integer>();
		/*B.add(3);
		B.add(3);
		B.add(7);	*/
		B.add(1000000);
		System.out.println(intersect(A, B));
	}

	 public static ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
		 int len1 = A.size();
		 int len2 = B.size();
		 ArrayList<Integer> res = new ArrayList<Integer>();
		 int i=0,j=0;
		 while(i<len1 && j<len2){
			 if(A.get(i).intValue()<B.get(j).intValue()){
				 i++;
			 }else if(A.get(i).intValue()>B.get(j).intValue()){
				 j++;
			 }else if(A.get(i).intValue()==B.get(j).intValue()){
				 res.add(A.get(i));
				 i++;
				 j++;
			 }
			 System.out.println(i);
			 System.out.println(j);
		 }
		 return res;
	 }
}
