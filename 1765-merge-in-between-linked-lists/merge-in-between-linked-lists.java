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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode t2=list2;
        while(t2.next!=null)
        {
            t2=t2.next;
        }
        ListNode t1=list1;
        ListNode a1=null,b1=null;
        int c=0;
        while(t1!=null)
        {
            if(c==a-1)
            {
                a1=t1;
            }
            if(c==b)
            {
                b1=t1;
                break;
            }
            c++;
            t1=t1.next;
        }
        a1.next=list2;
        t2.next=b1.next;
        b1.next=null;
        return list1;
    }
}