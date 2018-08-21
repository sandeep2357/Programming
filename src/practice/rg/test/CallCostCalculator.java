package practice.rg.test;
import java.util.HashMap;


public class CallCostCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "00:01:07,400-234-090\n" +
				"00:05:01,701-080-080\n" +
				"00:05:00,400-234-090\n";
		System.out.println(solution(S));
	}
	public static int solution(String S) {
        // write your code in Java SE 8
		String[] calls = S.split("\n");
		int numCalls = calls.length;
		int i;
		HashMap<Integer,Integer> callLog = new HashMap<Integer,Integer>();
		
		//Populating a map to get the discounted call
		for(i=0;i<numCalls;i++){
			String[] data = calls[i].split(",");
			String duration = data[0];
			String number = data[1];
			int seconds = getSeconds(duration);
			int mobNum = getMobNumber(number);
			if(callLog.containsKey(mobNum)){
				callLog.put(mobNum, callLog.get(mobNum)+seconds);
			}else{
				callLog.put(mobNum, seconds);
			}
		}

		//finding the discounted call 
		int discountNum = 0;
		int maxDuration = 0;
		for(int k:callLog.keySet()){
			if(callLog.get(k)>maxDuration){
				maxDuration=callLog.get(k);
				discountNum = k;
			}else if(callLog.get(k)==maxDuration){
				discountNum = Math.min(k, discountNum);
			}
		}
		
		//calculating the bill excluding the discounted number
		int cost = 0;
		for(i=0;i<numCalls;i++){
			String[] data = calls[i].split(",");
			String duration = data[0];
			String number = data[1];
			int seconds = getSeconds(duration);
			int mobNum = getMobNumber(number);
			if(mobNum!=discountNum){
				cost = cost + getCallCost(seconds);
			}
		}
       return cost; 
    }
	
	public static int getSeconds(String duration){
		String[] parts = duration.split(":");
		int seconds = Integer.parseInt(parts[0])*3600 + Integer.parseInt(parts[1])*60 + Integer.parseInt(parts[2]);
		return seconds;
	}
	
	public static int getMobNumber(String number){
		String[] parts = number.split("-");
		int mobNum = Integer.parseInt(parts[0]+parts[1]+parts[2]);
		return mobNum;
	}
	
	public static int getCallCost(int seconds){
		if(seconds<5*60){
			return seconds*3;
		}else{
			int mins = seconds/60;
			if(seconds%60>0){
				mins=mins+1;
			}
			return mins*150;
		}
	}

}
