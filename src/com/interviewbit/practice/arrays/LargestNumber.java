package com.interviewbit.practice.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>();
		A.add(3);
		A.add(30);
		A.add(34);
		A.add(5);
		A.add(9);
		String res = largestNumber(A);
		System.out.println(res);
	}
	
	public static String largestNumber(final List<Integer> A) {
        ArrayList<String> strList = new ArrayList<String>();
        String res = "";
        int len = A.size();
        if(len==0) {
            return "";
        }
        int i;
        for(i=0;i<len;i++) {
            strList.add(String.valueOf(A.get(i)));
        }
        
        Collections.sort(strList, new StringCompare());
        //System.out.println(strList);
        boolean allZeros = true;
        StringBuffer strBuf = new StringBuffer();
        for(String k:strList) {
            //System.out.println(strList.get(i));
            /*if(!"0".equals(k)){
                allZeros=false;
            }*/
            if("0".equals(k) && strBuf.length() != 0) {
                continue;   
            }
            //res += k;
            strBuf.append(k);
            //res.concat(strList.get(i)+"");
        }
        /*if(allZeros){
            res = "0";
        }*/
        //return res;
        return strBuf.toString();
    }
    public static class StringCompare implements Comparator<String> {
        public int compare(String a, String b) {
            String s1=a+b;
            String s2=b+a;
            return s2.compareTo(s1);
            /*if(s1.compareTo(s2)<0) {
                return 1;
            }else {
                return -1;
            }*/
        }
    }
}
