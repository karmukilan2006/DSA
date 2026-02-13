class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        for(int i=1;i<n;i++)
        {
            if(min>nums[i])
            {
                min=nums[i];
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Math.abs(nums[i]-min);
        }
        return sum;
    }
}