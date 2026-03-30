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
    public int[] nextLargerNodes(ListNode head) {
        int n=0;
        ListNode cur=head;
        while(cur!=null)
        {
            n++;
            cur=cur.next;  
        }
        int[] res=new int[n];
        Stack<Integer> stack=new Stack<>();
        int i=0;
        while(head!=null)
        {
            while(!stack.isEmpty() && res[stack.peek()]<head.val)
            {
                res[stack.pop()]=head.val;
            }
            res[i]=head.val;
            
            stack.push(i);
            head=head.next;
            i++;
        }
        while(!stack.isEmpty())
        {
            res[stack.pop()]=0;
        }
        return res;

    }
}