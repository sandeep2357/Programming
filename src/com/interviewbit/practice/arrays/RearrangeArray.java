package com.interviewbit.practice.arrays;

import java.util.ArrayList;

public class RearrangeArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(4);
		a.add(0);
		a.add(3);
		a.add(1);
		a.add(2);
		arrange(a);
		System.out.println(a);
	}
	
	public static void arrange(ArrayList<Integer> a) {
		// Strategy to store 2 values in same place
		// A = B + C * N
		// B = A % N
		// C = A / N
		int len = a.size();
		int i;
		for(i=0;i<len;i++){
			int res = a.get(i) + (a.get(a.get(i))%len)*len;
			a.set(i,res);
		}
		
		for(i=0;i<len;i++){
			a.set(i,a.get(i)/len);
		}
    }

}
