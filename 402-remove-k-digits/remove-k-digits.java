class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Integer> stack=new Stack<>();
        int count=0;

        for(int i=0;i<n;i++)
        {
            char ch=num.charAt(i);
            int temp = ch - '0';
            while(!stack.isEmpty() && stack.peek()>temp && count<k)
            {
                stack.pop();
                count++;
            }
            stack.push(temp);
        

        }
        while(count < k && !stack.isEmpty())
        {
            stack.pop();
            count++;
        }
        boolean leadingZero=true;
        int n1=stack.size();
        String res="";
        for(int i=0;i<n1;i++)
        {
            int temp=stack.get(i);
            if(leadingZero && temp == 0) 
            {
                continue;
            }
            leadingZero=false;
        
            char ch=(char)(temp+'0');
            
            res+=ch;
            
        }
        if(res.length()==0)
        {
            return "0";
        }
        return res;

    }
}