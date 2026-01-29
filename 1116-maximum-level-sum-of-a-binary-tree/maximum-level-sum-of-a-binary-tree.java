class Solution {
    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        int ansLevel = 1;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            if (sum > max) {
                max = sum;
                ansLevel = level;
            }

            level++;
        }
        return ansLevel;
    }
}
