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

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        dfs(root, targetSum, new ArrayList<>(), 0);
        return list;
    }

    private void dfs(TreeNode root, int targetSum, List<Integer> path, int sum) {
        if (root == null) return;

      
        path.add(root.val);
        sum += root.val;

       
        if (root.left == null && root.right == null) {
            if (sum == targetSum) {
                
                list.add(new ArrayList<>(path));
            }
        }

        dfs(root.left, targetSum, path, sum);
        dfs(root.right, targetSum, path, sum);

        
        path.remove(path.size() - 1);
    }
}