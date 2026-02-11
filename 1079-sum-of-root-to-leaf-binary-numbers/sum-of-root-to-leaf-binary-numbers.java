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
    List<Integer> list=new ArrayList<>();
    public int sumRootToLeaf(TreeNode root) {
        solve(root,"");
        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum+=list.get(i);
        }
        return sum;
    }
    public void solve(TreeNode root,String path)
    {
        if(root==null)
        {
            return;
        }
        path+=root.val;
        if(root.left==null && root.right==null)
        {
            int temp=Integer.parseInt(path,2);
            list.add(temp);
            return;
        }
        solve(root.left,path);
        solve(root.right,path);
    }
}