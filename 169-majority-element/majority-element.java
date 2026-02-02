class Solution {
    public int majorityElement(int[] nums) {
/*
        int value=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                value=nums[i];
            }
            if(nums[i]==value)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return value;

        */
        int len=nums.length;
        Arrays.sort(nums);
        int temp=len/2;
        return nums[temp];
        


    }
}