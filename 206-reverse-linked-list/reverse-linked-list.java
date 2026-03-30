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
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode cur=head;
        ListNode fut=null;
        while(cur!=null)
        {
            fut=cur.next;
            cur.next=pre;
            pre=cur;
            cur=fut;
        }
        return pre;
    }
}