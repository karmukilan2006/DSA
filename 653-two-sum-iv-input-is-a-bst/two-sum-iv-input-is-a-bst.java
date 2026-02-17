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
    public List<Integer> list=new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        solve(root);
        return add(list,k);
    }
    public void solve(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        solve(root.left);
        list.add(root.val);
        solve(root.right);

    }
    public boolean add(List<Integer> list,int target)
    {
        int n=list.size();
        int left=0;
        int right=n-1;
        int sum=0;
        int count=0;
        while(left<right)
        {
            sum=list.get(left)+list.get(right);
            if(sum>target)
            {
                right--;
            }
            else if(sum<target)
            {
                left++;
            }
            else
            {
               return true;
            }

        }
        
        return false;

    }
}