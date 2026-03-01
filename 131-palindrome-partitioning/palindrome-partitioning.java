class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<>();
        solve(0, s, new ArrayList<>(), list);
        return list;
    }
    public void solve(int index,String s,List<String> str,List<List<String>> list)
    {
        if(index==s.length())
        {
           list.add(new ArrayList<>(str)); 
            return;
        }
        for(int end=index;end<s.length();end++)
        {
            if(palindrome(index,end,s))
            {
                str.add(s.substring(index, end + 1));
                solve(end+1,s,str,list);
                str.remove(str.size()-1);
            }
        }

    }
   public boolean palindrome(int l, int r, String s)
    {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}