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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head==null)
        {
            return head;
        }
        HashSet<Integer> set = new HashSet<>();

for (int num : nums) {
    set.add(num);
}

        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode curr=head;
        while(curr!=null)
        {
            if(!set.contains(curr.val))
            {
                temp.next=curr;
                temp=curr;
            }
            curr=curr.next;
            
        }
        temp.next=null;
        return dummy.next;
    }
}