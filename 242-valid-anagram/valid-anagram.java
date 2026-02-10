class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrs = s.toCharArray();
        char[] arrt = t.toCharArray();
        Arrays.sort(arrs);
        Arrays.sort(arrt);
        int len1=arrs.length;
        int len2=arrt.length;
        if(len1!=len2)
        {
            return false;
        }
        for(int i=0;i<len1;i++)
        {
            if(arrs[i]!=arrt[i])
            {
                return false;
            }
        }
        return true;
    }
}