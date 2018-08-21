package practice.rg.test;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class minDIstanceIndices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {0,3,3,7,5,3,11,1};
		System.out.println(solution(A));
	}
	public static int solution(int[] A) {
        // write your code in Java SE 8
		int len = A.length;
		Integer[] indices = new Integer[len];
		int i;
		for(i=0;i<len;i++){
			indices[i] = i;
		}
		IndexComparator comparator = new IndexComparator(A);
		Arrays.sort(indices,comparator);
		
		int minDist=Integer.MAX_VALUE;
		for(i=1;i<len;i++){
			if(minDist>Math.abs(A[i]-A[i-1])){
				minDist = Math.abs(A[i]-A[i-1]);
			}
		}
		return minDist;
    }
	
}

class IndexComparator implements Comparator<Integer>{
	int[] array;
	public IndexComparator(int[] A){
		this.array = A;
	}
	
	public int compare(Integer idx1, Integer idx2){
		if(array[idx1] < array[idx2]){
			return -1;
		}else if(array[idx1] == array[idx2]){
			return 0;
		}else{
			return 1;
		}
	}
}
