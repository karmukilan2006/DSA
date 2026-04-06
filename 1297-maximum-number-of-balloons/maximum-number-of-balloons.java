class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[26];

        for (int i = 0; i < text.length(); i++) {
            arr[text.charAt(i) - 'a']++;
        }

        String need = "balloon";
        int count = 0;

        while (true) {
            int nn = 0;   // reset for each attempt

            for (int i = 0; i < need.length(); i++) {
                char ch = need.charAt(i);

                if (arr[ch - 'a'] > 0) {
                    arr[ch - 'a']--;
                    nn++;
                } else {
                    return count;   // cannot form more
                }
            }

            if (nn == need.length()) {
                count++;
            }
        }
    }
}