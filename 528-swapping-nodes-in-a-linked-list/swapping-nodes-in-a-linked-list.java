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
    public ListNode swapNodes(ListNode head, int k) {
        int len=0;
        ListNode curr=head;
        ListNode temp1=head;
        ListNode temp2=head;
        while(curr!=null)
        {
            curr=curr.next;
            len++;
        }
        for(int i=1;i<k;i++)
        {
            temp1=temp1.next;
        }
        for(int i=0;i<len-k;i++)
        {
            temp2=temp2.next;
        }
        int tt=temp1.val;
        temp1.val=temp2.val;
        temp2.val=tt;
        return head;
    }
}