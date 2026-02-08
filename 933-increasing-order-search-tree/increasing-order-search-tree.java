class Solution {
    public List<Integer> list = new ArrayList<>();

    public TreeNode increasingBST(TreeNode root) {
        solve(root);

        Collections.sort(list);

        return trees(list);
    }
    public void solve(TreeNode root) {
        if (root == null) return;
        solve(root.left);  
        list.add(root.val);
        solve(root.right);  
    }

    public TreeNode trees(List<Integer> list) {
        TreeNode dummy = new TreeNode(0);
        TreeNode current = dummy;

        while (!list.isEmpty()) {
            int temp = list.remove(0);      
            TreeNode news = new TreeNode(temp);
            current.right = news;          
            current = current.right;        
        }

        return dummy.right; 
    }
}
