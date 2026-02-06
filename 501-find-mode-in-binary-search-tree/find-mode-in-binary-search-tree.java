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
    public int[] findMode(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> hash=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            if(hash.containsKey(curr.val))
            {
                hash.put(curr.val,hash.get(curr.val)+1);
            }
            else
            {
                hash.put(curr.val,1);
            }
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
        }
        int max=0;
        for(int key:hash.keySet())
        {
            if(hash.get(key)>max)
            {
                max=hash.get(key);

            }
            
        }
        for(int key:hash.keySet())
        {
            if(max==hash.get(key))
            {
                list.add(key);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}