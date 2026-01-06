class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack=new Stack<>();
        int n=prices.length;
        int[] res=new int[n];

        for(int i=0;i<n;i++)
        {
           while(!stack.isEmpty() && prices[stack.peek()]>=prices[i])
           {
            int index=stack.pop();
            res[index]=prices[index]-prices[i];
           }
           stack.push(i);
        }
        while(!stack.isEmpty())
        {
            int index=stack.pop();
            res[index]=prices[index];

        }
        return res;
    }
}