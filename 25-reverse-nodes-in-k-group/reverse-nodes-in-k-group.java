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
    public ListNode reverse(ListNode send)
    {
        ListNode pre=null;
        ListNode curr=send;
        ListNode fut=null;
        while(curr!=null)
        {
            fut=curr.next;
            curr.next=pre;
            pre=curr;
            curr=fut;
        }
        return pre;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy1=new ListNode(0);
        ListNode dummy=dummy1;
        while(head!=null)
        {
            int i=1;
            ListNode send=null;
            ListNode tail=null;
            while(head!=null && i<=k)
            {
                if(send==null)
                {
                    send=head;
                    tail=send;
                }
                else
                {
                    tail.next=head;
                    tail=tail.next;
                }
                head=head.next;
                i++;
            }
            tail.next=null;
            if(i==k+1)
            {
                send=reverse(send);
                dummy.next=send;
                while(dummy.next!=null)
                {
                    dummy=dummy.next;
                }
            }
            else
            {
                dummy.next=send;
            }
        }
        return dummy1.next;
    }
}