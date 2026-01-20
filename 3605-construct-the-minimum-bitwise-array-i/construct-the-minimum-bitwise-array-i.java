class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {

        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int p = nums.get(i);

            // Even prime (only 2) → impossible
            if ((p & 1) == 0) {
                ans[i] = -1;
                continue;
            }

            // Count trailing 1s
            int t = 0;
            int temp = p;
            while ((temp & 1) == 1) {
                t++;
                temp >>= 1;
            }

            // Minimum x
            ans[i] = p - (1 << (t - 1));
        }

        return ans;
    }
}
