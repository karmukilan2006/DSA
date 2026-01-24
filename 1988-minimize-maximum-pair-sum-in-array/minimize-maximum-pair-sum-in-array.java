class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=n-1;
        while(left<right)
        {
            int sum=nums[left]+nums[right];
            max=Math.max(sum,max);
            left++;
            right--;
        }
        return max;
    }
}