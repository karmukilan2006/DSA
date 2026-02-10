class Solution {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        HashMap<Character,Integer> hash1=new HashMap<>();
        HashMap<Character,Integer> hash2=new HashMap<>();

        for(int i=0;i<n1;i++)
        {
            char ch=s.charAt(i);
            if(!hash1.containsKey(ch))
            {
                hash1.put(ch,1);
            }
            else
            {
                hash1.put(ch,hash1.get(ch)+1);
            }
        }

        for (int i = 0; i < n2; i++) {
            char ch = t.charAt(i);   
            if (!hash2.containsKey(ch)) {
                hash2.put(ch, 1);
            } else {
                hash2.put(ch, hash2.get(ch) + 1);
            }
        }

        if(hash1.equals(hash2))
        {
            return true;
        }
        return false;

    }
}