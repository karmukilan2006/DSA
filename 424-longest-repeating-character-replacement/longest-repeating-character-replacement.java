class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch - 'A']++;

            if (freq[ch - 'A'] > maxFreq) {
                maxFreq = freq[ch - 'A'];
            }

            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            int len = right - left + 1;
            if (len > ans) {
                ans = len;
            }
        }

        return ans;
    }
}