package com.interviewbit.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NDivide3RepeatNumber {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		/*a.add(1);
		a.add(2);
		a.add(3);
		a.add(1);
		a.add(1);*/
		a.add(1000441);
		a.add(1000441);
		a.add(1000994);
		System.out.println(repeatedNumber(a));
		/*int k = 1000994;
		System.out.println(k==1000994);*/

	}
	public static int repeatedNumber(final List<Integer> a) {
		HashMap<Integer,Integer> hMap = new HashMap<Integer,Integer>(2);
		hMap.put(200, 0);
		hMap.put(300, 0);
		int len = a.size();
		int i;
		int curr;
		for(i=0;i<len;i++) {
			curr=a.get(i);
			if(hMap.containsKey(curr)) {
				hMap.put(curr, hMap.get(curr)+1);
			}else {
				if(hMap.containsValue(0)) {
					for(Integer k:hMap.keySet()){
						if(hMap.get(k)==0) {
							hMap.remove(k);
							hMap.put(curr, 1);
							break;
						}
					}
				}else {
					for(Integer k:hMap.keySet()){
						hMap.put(k, hMap.get(k)-1);
					}
				}
			}
		}
		System.out.println(hMap);
		for(Integer k:hMap.keySet()) {
			int mapElemCount = 0;
			//.out.println(k);
			for(i=0;i<len;i++) {
				//System.out.println(a.get(i));
				if(a.get(i).compareTo(k)==0) {
					mapElemCount++;
				}
			}
			System.out.println(mapElemCount);
			if(mapElemCount >Math.floor((len/3))) {
				return k;
			}
		}
		return -1;
    }

}
