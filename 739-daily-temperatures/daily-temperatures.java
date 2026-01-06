class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int n=temperatures.length;
        int[] res=new int[n];
        Arrays.fill(res,0);


        for(int i=0;i<n;i++)
        {
            int currindex=i;
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i])
            {
                int index=stack.pop();
                res[index]=i-index;
            }
        
            if(currindex<n)
            {
                stack.push(i);
            }
        }
        return res;

    }
}