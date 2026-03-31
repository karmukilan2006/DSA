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
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy=head;
        ListNode tail=head.next;

        ListNode ans=head;

        while(tail!=null)
        {
            int one=head.val;
            int two=tail.val;
            int temp=gcd(one,two);
            
            ans.next=new ListNode(temp);
            ans=ans.next;

            ans.next=tail;
            ans=ans.next;

            
            head=tail;
            tail=tail.next;
        }

        return dummy;

    }
}