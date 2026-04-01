class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        solve(s,n,0);
    }
    public void solve(char[] s,int n,int i)
    {
        if(i==(n/2))
        {
            return;
        }
        char ch=s[i];
        s[i]=s[n-i-1];
        s[n-i-1]=ch;

        solve(s,n,i+1);
    }
}