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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode dummy=new ListNode(-1,head);
        ListNode prev=dummy;
        ListNode curr=head;
        while(curr!=null && curr.next!=null)
        {
            ListNode second=curr.next;
            boolean f=false;
            while(second!=null && curr.val==second.val)
            {
                second=second.next;
                f=true;
            }
            if(f==false)
            {
                prev.next=curr;
                prev=curr;
                curr=curr.next;
            }
            else{
                curr=second;
                prev.next=second;
            }
        }
        return dummy.next;
    }
}