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
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode dummy=new ListNode(-1,head);
        ListNode curr=head;
        ListNode prev=dummy;
        while(curr!=null && curr.next!=null)
        {
            ListNode nexpair=curr.next.next;
            ListNode second=curr.next;

            second.next=curr;
            curr.next=nexpair;
            prev.next=second;

            prev=curr;
            curr=nexpair;
        }
        return dummy.next;
    }
}