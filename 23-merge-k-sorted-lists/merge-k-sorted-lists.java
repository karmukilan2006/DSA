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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;

        int n=lists.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ListNode curr=lists[i];
            while(curr!=null)
            {
                list.add(curr.val);
                curr=curr.next;
            }
        }
        Collections.sort(list);

        for(int i=0;i<list.size();i++)
        {
            tail.next=new ListNode(list.get(i));
            tail=tail.next;
        }
        return dummy.next;

    }
}