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
    public ListNode rotateRight(ListNode head, int k) {
        int len=1;
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode cur=head;
        while(cur.next!=null)
        {
            cur=cur.next;
            len++;
        }
        k = k % len;
        cur.next=head;
        for(int i=1;i<len-k;i++)
        {
            head=head.next;
        }
        ListNode  newnode=head.next;
        head.next=null;
        return newnode;


    }
}