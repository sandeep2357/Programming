package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class VisitAllRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[[1,3],[3,0,1],[2],[0]]
		List<List<Integer>> inp = new ArrayList<List<Integer>>();
		inp.add(new ArrayList<Integer>(Arrays.asList(1,3)));
		inp.add(new ArrayList<Integer>(Arrays.asList(3,2,1)));
		inp.add(new ArrayList<Integer>(Arrays.asList(3)));
		inp.add(new ArrayList<Integer>(Arrays.asList(0)));
		/*inp.add(new ArrayList<Integer>(Arrays.asList(1)));
		inp.add(new ArrayList<Integer>(Arrays.asList(2)));
		inp.add(new ArrayList<Integer>(Arrays.asList(3)));
		inp.add(new ArrayList<Integer>(Arrays.asList()));*/
		System.out.println(canVisitAllRooms(inp));
	}
	public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
		int totalRooms = rooms.size();
		HashMap<Integer,Boolean> unVisitMap = new HashMap<Integer,Boolean>();
		HashMap<Integer,Boolean> visitMap = new HashMap<Integer,Boolean>();
		Queue<Integer> q = new LinkedList();
		int i;
		for(i=0;i<totalRooms;i++) {
			unVisitMap.put(i,false);
		}
		if(totalRooms<=1) {
			return true;
		}
		List<Integer> nRoom = rooms.get(0);
		for(int j=0;j<nRoom.size();j++) {
			q.add(nRoom.get(j));
		}
		i=0;
		//System.out.println(unVisitMap);
		int count =0;
		while(!q.isEmpty()) {
			nRoom = rooms.get(i);
			//System.out.println(i);
			if(!visitMap.containsKey(i)) {
				for(int j=0;j<nRoom.size();j++) {
					q.add(nRoom.get(j));
				}
				q.poll();
				//System.out.println(q);
				visitMap.put(i, true);
				if(unVisitMap.containsKey(i)) {
					unVisitMap.remove(i);
				}
			}else {
				q.poll();
			}
			if(!q.isEmpty()) {
				i=q.peek();
			}
			
		}
		//System.out.println(unVisitMap);
		if(!unVisitMap.isEmpty()) {
			return false;
		}
        return true;
    }

}
