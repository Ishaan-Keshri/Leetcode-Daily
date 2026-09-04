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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null && head.next==null)
        {
            return head;
        }
        ListNode temp=head.next;
        ListNode  prev=head;
        while(temp!=null)
        {
            ListNode newNode=new ListNode(findGcd(prev.val,temp.val),temp);
            prev.next=newNode;
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static int findGcd(int a, int b) {
        while(a > 0 && b > 0) {
            if(a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if(a == 0) {
            return b;
        }
        
        return a;
    }
}