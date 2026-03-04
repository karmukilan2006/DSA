class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        solve(nums, set, 0, new ArrayList<>());
        return new ArrayList<>(set);
    }

    public void solve(int[] nums, Set<List<Integer>> set,
                      int index, List<Integer> curr) {

        if(index == nums.length) {
            List<Integer> temp = new ArrayList<>(curr);
            Collections.sort(temp);  
            set.add(temp);
            return;
        }

        solve(nums, set, index + 1, curr);

        curr.add(nums[index]);
        solve(nums, set, index + 1, curr);
        curr.remove(curr.size() - 1);
    }
}