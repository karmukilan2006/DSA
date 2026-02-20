int lengthOfLongestSubstring(char* s) {
     int n = strlen(s);
    int maxLen = 0;

    for (int i = 0; i < n; i++) {
        int seen[256] = {0};  // boolean array to track characters
        int len = 0;

        for (int j = i; j < n; j++) {
            unsigned char c = s[j];  // ensure proper index
            if (seen[c]) {
                break;  // duplicate found
            }
            seen[c] = 1;  // mark character as seen
            len++;
        }

        if (len > maxLen) {
            maxLen = len;
        }
    }

    return maxLen;
}