package com.interviewbit.practice.arrays;

import java.util.ArrayList;

public class FizzBuzz {

	public static void main(String[] args) {
		int n=20;
		System.out.println(fizzBuzz(n));
	}
	
	public static ArrayList<String> fizzBuzz(int A) {
		int i;
		ArrayList<String> res = new ArrayList<String>();
		for(i=1;i<=A;i++) {
			if(i%3==0 && i%5==0) {
				res.add("FizzBuzz");
			}else if(i%3==0) {
				res.add("Fizz");
			}else if(i%5==0) {
				res.add("Buzz");
			}else {
				res.add(i+"");
			}
		}
		return res;
    }

}
