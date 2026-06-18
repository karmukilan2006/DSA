class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res);
        return res;
    }

    public void backtrack(int index, int[] nums, List<List<Integer>> res) {

        if (index == nums.length) {
            List<Integer> curr = new ArrayList<>();
            for (int i=0;i<nums.length;i++) {
                curr.add(nums[i]);
            }
            res.add(curr);
            return;
        }
        for (int i = index; i < nums.length; i++) {

            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            backtrack(index + 1, nums, res);

            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
}