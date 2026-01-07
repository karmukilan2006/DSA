class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            String ch=tokens[i];
            if(ch.equals("+"))
            {
                int one=stack.pop();
                int two=stack.pop();
                int sum=two+one;
                stack.push(sum);
            }
            else if(ch.equals("-"))
            {
                int one=stack.pop();
                int two=stack.pop();
                int sum=two-one;
                stack.push(sum);   
            }
            else if(ch.equals("*"))
            {
                int one=stack.pop();
                int two=stack.pop();
                int sum=two*one;
                stack.push(sum);
            }
            else if(ch.equals("/"))
            {
                int one=stack.pop();
                int two=stack.pop();
                int sum=two/one;
                stack.push(sum);
            }
            else
            {
                int num=Integer.parseInt(ch);
                stack.push(num);
            }
        }
        return stack.pop();
    }
}