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
    public ListNode doubleIt(ListNode head) {
        ListNode newHead=reverseList(head);
        ListNode temp=newHead;
        int carry=0;
        while(temp!=null)
        {
            int m=(temp.val*2)+carry;
            carry=0;
            if(m>9)
            {
                carry=m/10;
            }
            temp.val=m%10;
            temp=temp.next;
        }
        newHead=reverseList(newHead);
        if(carry!=0)
        {
            ListNode newNode=new ListNode(carry,newHead);
            newHead=newNode;
        }
        
        return newHead;
    }
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        ListNode front;
        while(temp!=null)
        {
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}