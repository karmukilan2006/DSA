class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if(digits.length() == 0) return res;

        String[] map = {
            "", "",
            "abc", "def", "ghi",
            "jkl", "mno", "pqrs",
            "tuv", "wxyz"
        };
        solve(digits, 0, "", res, map);
        return res;
    }
    public void solve(String digits,int index,String s,List<String> res,String[] map)
    {
        if(index==digits.length())
        {
            res.add(s);
            return;
        }
        String letters=map[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++)
        {
            char c = letters.charAt(i);
            solve(digits, index + 1, s + c, res, map);
        }
    }
}