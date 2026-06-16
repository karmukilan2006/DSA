class Solution {
    public void reverseString(char[] s) {
        int r=s.length-1;
        /*
        int l=0;
        while(l<r)
        {
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
*/
        solve(s,0,r);
    }
    public void solve(char[] s,int l,int r)
    {
        if(l>=r)
        {
            return;
        }
        char temp=s[l];
        s[l]=s[r];
        s[r]=temp;
        solve(s,l+1,r-1);
    }

}