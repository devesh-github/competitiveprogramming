package com.dev.dcp.leetcode;

/**
 * Created by My PC on 2/1/2021.
 */
public class RemoveDuplicatesfromSortedListII {

    public ListNode deleteDuplicates(ListNode head) {
        // sentinel
        ListNode sentinel = new ListNode(0, head);
        ListNode prev = sentinel;
        while(head!=null) {
            //System.out.println(head.val);
            if(head.next!=null && head.val==head.next.val) {
                while(head.next!=null && head.val==head.next.val) {
                    head = head.next;
                }
                System.out.println("p:"+prev.val);
                prev.next = head.next;
            } else {
                System.out.println(prev.val);
                prev = prev.next;
            }
            head = head.next;
        }

        return sentinel.next;
    }

}
