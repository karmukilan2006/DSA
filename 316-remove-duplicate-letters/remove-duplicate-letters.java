class Solution {
    public String removeDuplicateLetters(String s) {

        int n = s.length();

        int[] last = new int[26];
        for (int i = 0; i < n; i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();
        boolean[] used = new boolean[26];

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (used[ch - 'a']) continue;

            while (!stack.isEmpty()
                && stack.peek() > ch
                && last[stack.peek() - 'a'] > i) {

                used[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            used[ch - 'a'] = true;
        }

        StringBuilder res = new StringBuilder();
        for (char c : stack) res.append(c);

        return res.toString();
    }
}
