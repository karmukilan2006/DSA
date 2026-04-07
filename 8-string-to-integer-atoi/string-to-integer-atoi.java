class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        // 1. skip spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. sign
        int sign = 1;
        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++;
        }

        // 3. build number
        int res = 0;

        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';

            // 4. simple overflow check
            if (res > 214748364 || (res == 214748364 && digit > 7)) {
                if (sign == 1) return 2147483647;
                else return -2147483648;
            }

            res = res * 10 + digit;
            i++;
        }

        return res * sign;
    }
}