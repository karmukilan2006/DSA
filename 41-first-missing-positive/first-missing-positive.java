class Solution {
    public int firstMissingPositive(int[] nums) {
/*      int len=nums.length;
        Arrays.sort(nums);
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           if (nums[i] > 0) {
            map.put(nums[i], true);
            }
        }
        int i = 1;
        while (true) {
            if (!map.containsKey(i)) {
                return i; 
            }
            i++;
        }
*/
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                set.add(nums[i]);
            }
        }

        
        int i = 1;
        while (true) {
            if (!set.contains(i)) {
                return i;
            }
            i++;
        }
        
    }
}