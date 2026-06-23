class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int i=n-1;
        int[] res=new int[n];
        while(left<=right)
        {
            int first=nums[left]*nums[left];
            int last=nums[right]*nums[right];

            if(first<last)
            {
                res[i]=last;
                right--;
            }
            else
            {
                res[i]=first;
                left++;
            }
            i--;
        }
        return res;
    }
}