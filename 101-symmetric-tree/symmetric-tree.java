/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        return solve(root.left,root.right);
    }
    public boolean solve(TreeNode Left,TreeNode Right)
    {
        if(Left==null  && Right==null)
        {
            return true;
        }
        if(Left==null || Right==null || Left.val!= Right.val)
        {
            return false;
        }

        return solve(Left.left,Right.right) && solve(Left.right,Right.left);

    }
}