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
    public boolean checkTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int m=q.size();
            
            
            for(int i=0;i<m;i++)
            {
                TreeNode curr=q.poll();
                int sum=0;
                if(curr.left!=null)
                {
                    sum+=curr.left.val;
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    sum+=curr.right.val;
                    q.add(curr.right);
                }
                if(curr.val!=sum && (curr.left!=null || curr.right!=null))
                {
                    return false;
                }
            }
            
        }
        return true;
    }
}