package com.interviewbit.practice.linkedlists;

class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class DetectCycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ListNode detectCycle(ListNode a) {
		ListNode b = new ListNode(a.val);
        b.next = a.next;
        ListNode c = new ListNode(a.val);
        c.next = a.next;
        while(c.next!=null && c.next.next!=null){
            b = b.next;
            c = c.next.next;
            if(b==c){
                break;
            }
        }
        if(c.next==null || c.next.next==null){
            return null; //no cycle
        }
        while(a.val!=b.val){
            a = a.next;
            b = b.next;
        }
        return a;
    }

}
