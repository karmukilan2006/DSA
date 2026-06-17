class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res);
        return res;
    }

    public void backtrack(int index, int[] nums, List<List<Integer>> res) {

        if (index == nums.length) {
            List<Integer> curr = new ArrayList<>();
            for (int num : nums) {
                curr.add(num);
            }
            res.add(curr);
            return;
        }

        for (int i = index; i < nums.length; i++) {

            // swap
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            backtrack(index + 1, nums, res);

            // swap back (backtracking)
            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
}