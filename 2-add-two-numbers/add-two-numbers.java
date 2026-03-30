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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();

        while(l1!=null)
        {
            list1.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null)
        {
            list2.add(l2.val);
            l2=l2.next;
        }

        //Collections.reverse(list1);
        //Collections.reverse(list2);
        int carry=0;
        int i=0,j=0;

        while(i<list1.size() || j<list2.size() || carry!=0)
        {
            int temp1=i<list1.size() ? list1.get(i) : 0;
            int temp2=j<list2.size() ? list2.get(j) : 0;
            int sum=temp1+temp2+carry;
            result.add(sum%10);
            carry=sum/10;
            i++;
            j++;
        }

        //Collections.reverse(result);

        ListNode res=new ListNode(0);
        ListNode current=res;
        for(int k=0;k<result.size();k++)
        {
            current.next=new ListNode(result.get(k));
            current=current.next;
            
        }

        return res.next;
        */

        int carry=0;
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        
        while(l1!=null || l2!=null || carry!=0)
        {
            int a=0;
            int b=0;
            if(l1!=null)
            {
                a=l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                b=l2.val;
                l2=l2.next;
            }
            int sum=a+b+carry;
            cur.next=new ListNode(sum%10);
            cur=cur.next;
            carry=sum/10;
        }
        return dummy.next;
    }
}