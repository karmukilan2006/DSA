class Solution {
    public int[] nextGreaterElements(int[] nums) {
        //lenght ..
        int n=nums.length;
        int[] res=new int[n];
        Arrays.fill(res,-1);

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<2*n;i++)
        {
            int currindex=i%n;

            while(!stack.isEmpty() && (nums[stack.peek()] < nums[currindex]))
            {
                int index=stack.pop();
                res[index]=nums[currindex];

            }
            if(i<n)
            {
                stack.push(currindex);
            }
        }
        return res;
    }
}