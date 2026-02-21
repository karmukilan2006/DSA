void solve(int* nums,int numsSize)
{
    for(int i=0;i<numsSize-1;i++)
    {
        for(int j=0;j<numsSize-i-1;j++)
        {
            if(nums[j]>nums[j+1])
            {
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }
    }
}
int singleNumber(int* nums, int numsSize) {
    solve(nums,numsSize);
    for(int i=1;i<numsSize;i+=2)
    {
        if(nums[i]!=nums[i-1])
        {
            return nums[i-1];
        }
    }
    return nums[numsSize-1];
}
