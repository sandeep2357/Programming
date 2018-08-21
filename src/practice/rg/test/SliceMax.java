package practice.rg.test;

public class SliceMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[6];
		A[0] = 1;
		A[1] = 2;
		A[2] = -3;
		A[3] = 4;
		A[4] = 5;
		A[5] = -6;
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
		int len = A.length;
		int i=0;
		int sum=0,maxsum= Integer.MIN_VALUE;
		while(i<len){
			int j=i;
			sum=0;
			while(j<len && A[j]>=0){
				sum = sum + A[j];
				j++;
			}
			if(sum>maxsum){
				maxsum = sum;
			}
			i=j;
			i++;
		}
        return maxsum;
    }

}
