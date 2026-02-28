class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res=new ArrayList<>();
        solve(0,s,s.length(),"",res);
        return res;
    }
    public void solve(int index,String s,int len,String curr,List<String> res)
    {
        if(index==len)
        {
            res.add(curr);
            return;
        }
        char ch=s.charAt(index);
        if(Character.isLetter(ch))
        {
            solve(index + 1, s,len, curr + Character.toLowerCase(ch), res);
            solve(index + 1, s,len, curr + Character.toUpperCase(ch), res);
        }
        else
        {
            curr+=ch;
            solve(index+1,s,len,curr,res);

        }
    }
}