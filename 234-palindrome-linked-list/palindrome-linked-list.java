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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode slower=null;
        if(head == null || head.next == null) return true;
        while(fast!=null && fast.next!=null)
        {
            slower=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        slower.next=null;
        ListNode first=head;
        ListNode cur=slow;
        ListNode fut=null;
        ListNode pre=null;
        while(cur!=null)
        {
            fut=cur.next;
            cur.next=pre;
            pre=cur;
            cur=fut;
        }
        ListNode second=pre;

        while(first!=null)
        {
            if(first.val!=second.val)
            {
                return false;
            }
            first=first.next;
            second=second.next;

        }
        return true;

    }
}