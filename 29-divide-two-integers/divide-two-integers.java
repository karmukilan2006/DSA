class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == divisor) return 1;

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean sign = true;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
            sign = false;

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long res = 0;

        while (n >= d) {
            int cnt = 0;

            while (n >= (d << (cnt + 1))) {
                cnt++;
            }

            res += (1 << cnt);
            n -= (d << cnt);
        }

        if (res == (1 << 31) && sign)
            return Integer.MAX_VALUE;

        if (res == (1 << 31) && !sign)
            return Integer.MIN_VALUE;

        return sign ? (int) res : (int) -res;
    }
}
