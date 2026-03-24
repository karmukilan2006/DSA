class Solution {
    public int longestConsecutive(int[] nums) {
        int n1=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n1;i++)
        {
            set.add(nums[i]);
        }
        int max1=0;
        for(int n:set)
        {
            if(!set.contains(n-1))
            {
                int count=1;
                while(set.contains(n+1))
                {
                    count++;
                    n+=1;
                }
                max1=Math.max(count,max1);
            }
        }
        return max1;
    }
}