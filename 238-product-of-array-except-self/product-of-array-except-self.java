class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int[] pre = new int[len];
        int[] pos = new int[len];
        pre[0]=1;
        for(int i=1;i<len;i++)
        {
            pre[i]=pre[i-1]*nums[i-1];
        }
        pos[len-1]=1;
        for(int i=len-2;i>=0;i--)
        {
            pos[i]=pos[i+1]*nums[i+1];
        }
        for(int i=0;i<len;i++)
        {
            res[i]=pre[i]*pos[i];
        }

        

        return res;
    
        
    }
}