class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return build(head, null);
    }

    private TreeNode build(ListNode head, ListNode tail) {
        if (head == tail) return null;

        ListNode mid = findMid(head, tail);
        TreeNode root = new TreeNode(mid.val);

        root.left = build(head, mid);
        root.right = build(mid.next, tail);

        return root;
    }

    public ListNode findMid(ListNode head, ListNode tail) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
