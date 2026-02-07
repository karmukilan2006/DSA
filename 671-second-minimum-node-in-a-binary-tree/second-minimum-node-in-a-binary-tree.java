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
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null)
        {
            return -1;
        }

        HashSet<Integer> has=new HashSet<>();
        Queue<TreeNode> qq=new LinkedList<>();
        qq.add(root);
        while(!qq.isEmpty())
        {
            TreeNode curr=qq.poll();
            
            has.add(curr.val);
            if(curr.left!=null)
            {
                qq.add(curr.left);
            }
            if(curr.right!=null)
            {
                qq.add(curr.right);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(has);
        Collections.sort(list);
        if(list.size()<=1)
        {
            return -1;
        }
        return list.get(1);
        
        
    }
}