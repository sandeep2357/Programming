package com.interviewbit.practice.string;

public class IntegerToRoman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int A = 348;
		System.out.println(intToRoman(A));
	}
	
	private static String romans[][] =     {
            {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}, //1-9
            {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}, //10-90
            {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}, //100-900
            {"M", "MM", "MMM"}
           };
	
	public static String intToRoman(int A) {
		StringBuilder sb =new StringBuilder();
		int i = -1;
		while(A > 0) {// from lowest digit to highest digit
			int cur = A % 10;
			i++;
			if(cur > 0) {
				sb.insert(0, romans[i][cur-1]);
			}    
			A /= 10;
		}
		return sb.toString();
	}

}
