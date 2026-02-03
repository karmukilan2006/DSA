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
    List<String> list=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root,"");
        return list;
    }
    void dfs(TreeNode root, String path) {
        if (root == null) return;

        path += root.val;

        if (root.left == null && root.right == null) {
            list.add(path);
            return;
        }

        dfs(root.left, path + "->");
        dfs(root.right, path + "->");
    }

    
}