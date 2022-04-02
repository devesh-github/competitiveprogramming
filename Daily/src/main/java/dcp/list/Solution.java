package dcp.list;
import java.util.*;
/**
 * Created by My PC on 10/13/2020.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {

    public ListNode sortList(ListNode head) {
        Map<Integer,ListNode> map = new HashMap<>();
        while(head.next!=null) {
            map.put(head.next.val,head.next);
            head=head.next;
        }
        System.out.println(map);
        List<Integer> l = new ArrayList<Integer>(map.keySet());
        Collections.sort(l);
        ListNode ln = new ListNode();
        for(Integer i:l) {
            ln.next=map.get(i);
            ln=ln.next;
            //ln.next.val=i;
        }
        return ln;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode ln = new ListNode();
        ln.next = new ListNode(4,new ListNode(2,new ListNode(5,new ListNode(1,null))));
        sol.sortList(ln);
    }

}