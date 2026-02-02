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

        /*
        int len=nums.length;
        Arrays.sort(nums);
        int temp=len/2;
        return nums[temp];
        */

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int key = nums[i];

            if(map.containsKey(key)) 
            {
                map.put(key,map.get(key)+1);
            } 
            else 
            {
                map.put(key,1);
            }
        }
        int maxfre=Integer.MIN_VALUE;
        int res=0;
        for(int key:map.keySet())
        {
            int freq=map.get(key);
            if(maxfre<freq)
            {
                maxfre=freq;
                res=key;
            }
        }
        return res;


    }
}