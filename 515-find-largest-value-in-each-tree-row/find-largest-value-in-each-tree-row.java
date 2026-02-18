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
    public List<Integer> largestValues(TreeNode root) {
        if(root==null)
        {
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
       // PriorityQueue<Integer> res=new PriorityQueue<>(Collections.reverseOrder());
        q.add(root);
        
        while(!q.isEmpty())
        {
            int m=q.size();
             int max = Integer.MIN_VALUE;
            for(int i=0;i<m;i++)
            {
                TreeNode curr=q.poll();
                max=Math.max(curr.val,max);
                if(curr.left!=null)
                {
                    q.add(curr.left);

                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }

            }
            list.add(max);
           
            
        }
        return list;
    }
}