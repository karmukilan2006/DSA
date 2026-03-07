class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int n=temperatures.length;
        int[] res=new int[n];
        Arrays.fill(res,0);

        for(int i=0;i<n;i++)
        {
           
               
            
                while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i])
                {
                    int top=stack.pop();
                    res[top]=i-top;
                }
                 stack.push(i);
            
        }
        return res;

    }
}