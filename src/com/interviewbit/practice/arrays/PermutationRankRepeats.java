package com.interviewbit.practice.arrays;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class PermutationRankRepeats {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String A="hsyeyyhhdgfHF";
		A="bbbbaaaa";
		//System.out.println(fact(34));
		//System.out.println(factorial(34));
		System.out.println(permutationRankRepeat(A));
		//System.out.println(findRank(A));
	}
	
	private static BigInteger factorial(final int n) {
        BigInteger sum = BigInteger.ONE;

        if (n < 2) {
            return BigInteger.valueOf(n);
        }

        for (int j = 2; j <= n; j++) {
            sum = sum.multiply(BigInteger.valueOf(j));

        }
        return sum.mod(BigInteger.valueOf((long)1000003));
    }

    public static int findRank(String a) {

        if (a.length() < 2) {
            return 1;
        }
        
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        BigInteger sum = BigInteger.ONE;

        for (int i = 0; i < a.length(); i++) {
            System.out.println(map1);
            System.out.println(a.charAt(i));
            if (!map1.containsKey(a.charAt(i))) {
                map1.put(a.charAt(i), 1);
            } else {
                int cc = (int)map1.get(a.charAt(i));
                map1.put(a.charAt(i), cc+1);
            }
        }
        
        System.out.println(map1);

        BigInteger temp1 = BigInteger.ONE;

        for (final Map.Entry<Character, Integer> entry : map1.entrySet()) {
            temp1 = temp1.multiply(factorial(entry.getValue()));
        }

        temp1 = temp1.pow(1000001);
        temp1 = temp1.mod(BigInteger.valueOf(1000003));

        for (int i = 0; i < a.length(); i++) {

            BigInteger rank = BigInteger.ZERO;

            for (int j = i + 1; j < a.length(); j++) {
                if (a.charAt(i) > a.charAt(j)) {
                    rank = rank.add(BigInteger.ONE);
                }
            }

            final BigInteger temp = factorial(a.length() - i - 1);

            rank = rank.multiply(temp1);
            rank = rank.multiply(temp);

            sum = sum.add(rank);
            sum = sum.mod(BigInteger.valueOf(1000003));
        }
        return sum.intValue();
    }
	
	public static int permutationRankRepeat(String A){
		int len = A.length();
		int i,j;
		int rank=1;
		for(i=0;i<len-1;i++){
			int s_count=0;
			for(j=i+1;j<len;j++){
				if(A.charAt(j)<A.charAt(i)){
					s_count++;
				}
			}
			System.out.println(s_count);
			HashMap<Character,Integer> dupMap = new HashMap<Character,Integer>();
			for(j=i;j<len;j++){
				if(dupMap.containsKey(A.charAt(j))){
					dupMap.put(A.charAt(j), dupMap.get(A.charAt(j))+1);
				}else{
					dupMap.put(A.charAt(j), 1);
				}
			}
			
			System.out.println(dupMap);
			int d_count =1;
			for(Integer k:dupMap.values()){
				d_count = (d_count * inverseNumber(fact(k)))%1000003;
			}
			
			System.out.println(d_count);
			long temp = ((fact(len-i-1))*s_count)%1000003;
			//rank = rank%1000003 + ((((fact(len-1-i)%1000003)*s_count)%1000003)/d_count)%1000003;
			rank = (rank%1000003 + ((int)temp * d_count))%1000003;
			//rank = rank%1000003;
		}
		return rank;
	}
	
	static int inverseNumber(int num) {
        // Inverse modulo : https://en.wikipedia.org/wiki/Modular_multiplicative_inverse
        // Calculate num ^ MOD-2  % MOD
        int ans = 1, base = (int) num;
        int power = 1000001;
        while (power > 0) {
            if (power == 1) {
                return (ans * base) % 1000003;
            }
            if (power % 2 == 0) {
                base = (base * base) % 1000003;
                power /= 2;
            } else {
                ans = (ans * base) % 1000003;
                power--;
            }
        }
        return ans;
    }
	
	public static int fact(int n){
		int i=1;
		int num=1;
		for(i=1;i<=n;i++){
			num=((num%1000003) * (i))%1000003;
		}
		return num;
	}

}
