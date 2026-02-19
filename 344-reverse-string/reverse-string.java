class Solution {
    public void reverseString(char[] s) {
        solve(s,0,s.length-1);
    }
    public void solve(char[] s,int l,int r)
    {
        if(l>=r)
        {
            return;
        }
        char ch=s[l];
        s[l]=s[r];
        s[r]=ch;
        solve(s,l+1,r-1);
    }
}