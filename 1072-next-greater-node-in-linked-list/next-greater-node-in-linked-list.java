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
        Stack<Integer> stack=new Stack<>();
        ListNode dummy1=head;
        ListNode dummy=head;

        int n=0;
        while(dummy1!=null)
        {
            n++;
            dummy1=dummy1.next;
            
        }

        int[] res=new int[n];
        int i=0;

        while(dummy!=null)
        {
            while(!stack.isEmpty() && res[stack.peek()]<dummy.val)
            {
                int index=stack.pop();
                res[index]=dummy.val;
                
            }
            res[i]=dummy.val;
            stack.push(i);
            dummy=dummy.next;
            i++;
        }
        while(!stack.isEmpty())
        {
            int index=stack.pop();
            res[index]=0;
        }
        return res;


        
    }
}