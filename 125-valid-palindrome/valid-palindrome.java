class Solution {
    public boolean isPalindrome(String s) {
        String st="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'|| ch>='A' && ch<='Z')
            {
                st+=Character.toLowerCase(ch);
            }
            else if(ch>='0' && ch<='9')
            {
                st+=ch;
            }
            else
            {
                continue;
            }
        }
        int left=0;
        int right=st.length()-1;
        while(left<right)
        {
            char first=st.charAt(left);
            char last=st.charAt(right);
            if(first!=last)
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}