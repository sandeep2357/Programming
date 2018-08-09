package com.interviewbit.practice.linkedlists;

public class ReverseListBetweenIndices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode reverseBetween(ListNode A, int B, int C) {
		/*if(B==C){
            return A;
        }
        ListNode itr1 = new ListNode(A.val);
        itr1.next = A.next;
        ListNode itr2 = new ListNode(A.val);
        itr1.next = A.next;
        int bCount = 1;
        int cCount = 1;
        boolean moved = true;
        while(itr1!=null && itr2!=null && moved){
            moved=false;
            if(bCount<B-1){
                itr1=itr1.next;
                bCount++;
            }
            if(cCount<C){
                itr2=itr2.next;
                cCount++;
                moved = true;
            }
        }
        
        ListNode res = new ListNode(itr1.val);
        res.next = itr1.next;
        ListNode temp = null;

        ListNode temp2 = new ListNode(itr1.val);
        //temp2.next = itr1.next.next;
        temp = itr1.next;
        itr1=itr1.next;
        while(itr1!=null && itr2!=null && itr1!=itr2){
            
            temp2 = temp.next;
            temp.next = itr1;
            itr1=temp;
            temp = temp2;
        }
        res.next.next = temp2;
        res.next = itr2;
        
        return A;*/
        
        ListNode dummy = new ListNode(-1);
        dummy.next = A;
        ListNode pre = dummy;
        int cnt = 0, tot = C - B + 1;
        while(--B > 0)
            pre = pre.next;
        ListNode tail = pre.next;
        ListNode tailHead = tail;
        ListNode need = tail.next;
        while(++cnt < tot && need != null) {
            tail.next = need.next;
            need.next = tailHead;
            tailHead = need;
            pre.next = need;
            need = tail.next;
        }   
        return dummy.next;
    }

}
