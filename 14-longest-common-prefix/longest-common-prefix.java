class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String res="";
        for(int i=0;i<strs[0].length();i++)
        {
            char ch=strs[0].charAt(i);
            for(int j=1;j<n;j++)
            {
                if( i>=strs[j].length() || ch!=strs[j].charAt(i) )
                {
                    return res;
                }
            }
            res+=ch;
        }
        return res;
    }
}