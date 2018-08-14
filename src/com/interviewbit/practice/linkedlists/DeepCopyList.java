package com.interviewbit.practice.linkedlists;

import java.util.HashMap;

class RandomListNode {
	 int label;
	 RandomListNode next, random;
	 RandomListNode(int x) { this.label = x; }
};

public class DeepCopyList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static RandomListNode copyRandomList(RandomListNode head) {
		/*HashMap<Integer, RandomListNode>  m = new HashMap<Integer, RandomListNode>();
		RandomListNode temp = new RandomListNode(-1);
		temp.next = head.next;
		while(temp!=null){
			m.put(temp.label, new RandomListNode(temp.label));
			temp = temp.next;
		}
		temp = new RandomListNode(-1);
		temp.next = head.next;
		RandomListNode res = new RandomListNode(-1);
		RandomListNode itr = new RandomListNode(-1);
		itr.next = res.next;
		while(temp!=null){
			RandomListNode temp2 = new RandomListNode(-1);
			temp2.label = temp.label;
			temp2.next = m.get(temp.next.label);
			temp2.random = m.get(temp.random.label);
			temp = temp.next;
			res.next = temp2;
			res = res.next;
		}
		res = null;
		
		while(itr!=null){
			System.out.println(itr.label);
			System.out.println(itr.next.label);
			System.out.println(itr.random.label);
			itr=itr.next;
		}
		
		return itr.next;*/
		RandomListNode temp = head;
        RandomListNode itr = new RandomListNode(-1);
        RandomListNode copyNode = new RandomListNode(-1);
        copyNode = itr;
        itr.next = temp;
        while(head!=null){
            RandomListNode temp2 = new RandomListNode(-1);
            temp2.label = head.label;
            temp2.next = head.next;
            temp2.random = head;
            itr.next = temp2;
            itr = itr.next;
            head = head.next;
        }
        
        itr.next = null;
        head = temp;
        itr = copyNode.next;
        RandomListNode temp2 = itr;
        while(head!=null){
            temp2 = head.next;
            head.next = itr;
            itr = itr.next;
            head = temp2;
        }
        itr = copyNode.next;
        while(itr!=null){
            if(itr.random.random!=null){
                itr.random = itr.random.random.next;
            }else{
                itr.random = null;
            }
            itr = itr.next;
        }
        
        /*itr = copyNode.next;
        while(itr.next!=null){
            System.out.println(itr.random.label);
            itr = itr.next;
        }
        System.out.println(itr.random.label);*/
        
        return copyNode.next;
    }

}
