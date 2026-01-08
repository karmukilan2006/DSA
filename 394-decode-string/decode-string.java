class Solution {
    public String decodeString(String s) {
        Stack<Integer> countstack=new Stack<>();
        Stack<String> stringstack=new Stack<>();
        int num=0;
        String curr="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((Character.isDigit(ch)))
            {
                 num = num * 10 + (ch - '0');
            }
            else if(ch=='[')
            {
                countstack.push(num);
                stringstack.push(curr);
                num=0;
                curr="";

            }
            else if(Character.isLetter(ch))
            {
                curr = curr + ch;
            }
            else
            {
                int k=countstack.pop();
                String prev=stringstack.pop();
                String temp="";
                for(int j=0;j<k;j++)
                {
                    temp=temp+curr;
                }
                curr=prev+temp;
                

            }
        }
        return curr;


    }
}