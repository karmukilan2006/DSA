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
    public List<Integer> res=new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        solve(root,0);
        int s=0;
        for(int i=0;i<res.size();i++)
        {
            s+=res.get(i);
        }
        return s;
    }

    public void solve(TreeNode root,int sum)
    {
        if(root==null)
        {
            return;
        }
        sum=sum*10+root.val;
        if(root.left==null && root.right==null)
        {
            res.add(sum);
            return;

        }
        solve(root.left,sum);
        solve(root.right,sum);
    }
}