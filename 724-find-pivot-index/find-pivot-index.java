class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=nums[0];
        right[n-1]=nums[n-1];
        for(int i=1;i<n;i++)
        {
            left[i]=left[i-1]+nums[i];
        }
        for(int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]+nums[i];
        }
        int i=0,j=0;
        while(i<n && j<n)
        {
            if(left[i]==right[j])
            {
                return i;
            }
            i++;
            j++;
        }
        return -1;

    }
}