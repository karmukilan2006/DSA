class Solution {
    public int findMin(int[] nums) {
        int len=nums.length;
        int min=nums[0];
        for(int i=1;i<len;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }

        }
        return min;
    }
}